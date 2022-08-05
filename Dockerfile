FROM maven:3.8.6-openjdk-18 as maven_build
WORKDIR /app
COPY ./ .
RUN --mount=type=cache,target=/root/.m2  mvn clean package -Dmaven.test.skip

FROM openjdk:18
WORKDIR /app
COPY --from=maven_build /app/web/target/web-0.0.1-SNAPSHOT.jar ./target/web-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/target/web-0.0.1-SNAPSHOT.jar"]

# JAVA_HOME=/home/rishabh/.jdks/openjdk-18
# JAVA_HOME=/lib/jvm/java-1.8.0-openjdk-amd64
# mvn clean install -DskipTests
# mvn clean package -DskipTests
# java -jar web/target/web-0.0.1-SNAPSHOT.jar
#
# cd web
# sudo DOCKER_BUILDKIT=1 docker build -f Dockerfile -t springdemo .
# sudo docker run -p 8080:8080 -t springdemo
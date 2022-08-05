package com.rish889.order.service;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.rish889.employee.service.EmployeeService;
import com.rish889order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private EmployeeService employeeService;

    public String getAllOrders() {
        return "Rishabh Garcha Order 12. ".concat(employeeService.getAllEmployees());
    }
}

package com.rish889.moduleb;


import org.springframework.stereotype.Service;
import com.rish889.modulea.EmpoleeService;

@Service
public class EmpoleeServiceImpl implements EmpoleeService {
    public String getAllEmployees() {
        return "Rishabh Garcha 4";
    }
}

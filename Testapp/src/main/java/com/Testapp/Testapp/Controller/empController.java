package com.Testapp.Testapp.Controller;

import com.Testapp.Testapp.Entity.Employee;
import com.Testapp.Testapp.Service.Emplservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class empController {

    @Autowired
    Emplservice emplservice;
    
    @GetMapping("/home")
    public String home(){
        return "Welcome home api";
    }

    @PostMapping("/addnewemp")
     public ResponseEntity<Employee>   addnewemp(@RequestBody Employee employee){
     return emplservice.addnewemp(employee);
    }
}

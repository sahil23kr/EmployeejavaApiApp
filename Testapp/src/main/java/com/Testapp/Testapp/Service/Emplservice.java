package com.Testapp.Testapp.Service;

import com.Testapp.Testapp.Entity.Employee;
import org.springframework.http.ResponseEntity;

public interface Emplservice {
    ResponseEntity<Employee> addnewemp(Employee employee);
}

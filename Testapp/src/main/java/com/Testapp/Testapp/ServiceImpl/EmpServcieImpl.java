package com.Testapp.Testapp.ServiceImpl;

import com.Testapp.Testapp.Entity.Employee;
import com.Testapp.Testapp.Repo.EmployeeRepo;
import com.Testapp.Testapp.Service.Emplservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmpServcieImpl implements Emplservice {

    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public ResponseEntity<Employee> addnewemp(Employee employee) {
        //employeeRepo.save(employee);
        return new ResponseEntity<>(employeeRepo.save(employee), HttpStatus.CREATED);
    }
}

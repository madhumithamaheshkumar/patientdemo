package com.example.patientdemo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class APIController {
    @Autowired
    PatientService pservice;    
    
    @GetMapping("/getall")
    public List<Patient> getAll()
    {      
        return pservice.getAll();
    }    
    
    @PostMapping("/add")
    public String post(@RequestBody Patient p)
    {
        return pservice.add(p);        
    }
    
    @PutMapping("/edit")
    public String edit(@RequestBody Patient p)
    {
        return pservice.edit(p);
    }
    
    @DeleteMapping("/delete")
    public String delete(@RequestBody Patient p)
    {
        return pservice.delete(p);
    }
}
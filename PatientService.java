/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.patientdemo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientService {
    
    @Autowired
    PatientRepository prepository;
    
    public List<Patient> getAll()
    {
        return prepository.getAll();
    }
    
    public String add(Patient p)
    {
        return prepository.add(p);
    }
    
    public String edit(Patient p)
    {
        return prepository.edit(p);
    }
    public String delete(Patient p)
    {
        return prepository.delete(p);
    }
    
}

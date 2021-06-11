package com.example.patientdemo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepository {
    
    public List<Patient> plist=new ArrayList<Patient>();
    
    public List<Patient> getAll()
    {
        return plist;
    }
    public String add(Patient p)
    {
        plist.add(p);
        return "Add Success";
    }
    public String edit(Patient p)
    {
        plist.forEach(e->{
            if(e.getId()==p.getId())
            {
                e.setName(p.getName());
                e.setAilment(p.getAilment());
            }
        });
        return "Successfully Updated";
    }
    public String delete(Patient p)
    {
        int ind=-1;
        for(int i=0;i<plist.size();i++)
        {
            Patient l=plist.get(i);
            if(l.getId()==p.getId())
            {
                ind=i;
                break;
            }
        }
        if(ind>-1)
        {
            plist.remove(ind);
            return "Delete Success";
        }
        else
        {
            return "Nothing to Delete ";
        }      
    }
}

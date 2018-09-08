/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.dao.AddValues;
import com.dao.DeleteValues;
import com.dao.SelectById;
import com.dao.SelectIds;
import com.dao.SelectValue;
import com.dao.UpdateValues;
import com.pojo.*;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author use
 */
@ManagedBean
@RequestScoped
public class PatientBean {

    private PatientTable patient = new PatientTable();
    private User user=new User();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv=new SelectValue();
    DeleteValues dlv=new DeleteValues();
    SelectById sbi = new SelectById();

    public PatientTable getPatient() {
        patient.setAllIds(sli.allInpatientIds());
        patient.setPatient(slv.getPatient());
        return patient;
    }

    public void setPatient(PatientTable patient) {
        this.patient = patient;
    }

    public String savePatient() {

        patient.setPid(patient.getPid());
        patient.setPname(patient.getPname());
        patient.setPsex(patient.getPsex());
        patient.setPage(patient.getPage());
        patient.setBloodg(patient.getBloodg());
        patient.setWeight(patient.getWeight());
        patient.setAddress(patient.getAddress());
        patient.setPhoneno(patient.getPhoneno());
        patient.setDisease(patient.getDisease());
        patient.setDoctorid(patient.getDoctorid());
        patient.setPassword(patient.getPassword());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        
        patient.setUser(user);

        if (new AddValues().doSavePatient(patient)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updatePatient() {

        patient.setPid(patient.getPid());
        patient.setPname(patient.getPname());
        patient.setPsex(patient.getPsex());
        patient.setPage(patient.getPage());
        patient.setBloodg(patient.getBloodg());
        patient.setWeight(patient.getWeight());
        patient.setAddress(patient.getAddress());
        patient.setPhoneno(patient.getPhoneno());
        patient.setDisease(patient.getDisease());
        patient.setDoctorid(patient.getDoctorid());
        patient.setPassword(patient.getPassword());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        
        patient.setUser(user);

        if (upd.doUpdatePatientTable(patient)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deletePatient() {

        patient.setPid(patient.getPid());
        patient.setPname(patient.getPname());
        patient.setPsex(patient.getPsex());
        patient.setPage(patient.getPage());
        patient.setBloodg(patient.getBloodg());
        patient.setWeight(patient.getWeight());
        patient.setAddress(patient.getAddress());
        patient.setPhoneno(patient.getPhoneno());
        patient.setDisease(patient.getDisease());
        patient.setDoctorid(patient.getDoctorid());
        patient.setPassword(patient.getPassword());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        
        patient.setUser(user);
        dlv.doDeletePatientTable(patient);

        
    }
    public void findPatientById() {
        patient=sbi.findPatientTableById(patient.getPid());

        patient.setPid(patient.getPid());
        patient.setPname(patient.getPname());
        patient.setPsex(patient.getPsex());
        patient.setPage(patient.getPage());
        patient.setBloodg(patient.getBloodg());
        patient.setWeight(patient.getWeight());
        patient.setAddress(patient.getAddress());
        patient.setPhoneno(patient.getPhoneno());
        patient.setDisease(patient.getDisease());
        patient.setDoctorid(patient.getDoctorid());
        patient.setPassword(patient.getPassword());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        
        patient.setUser(user);

        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

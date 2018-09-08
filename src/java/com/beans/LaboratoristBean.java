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
public class LaboratoristBean {

    private Laboratorist laboratorist = new Laboratorist();
    private User user=new User();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv = new SelectValue();
    SelectById sbi = new SelectById();
    DeleteValues dlv=new DeleteValues();

    public Laboratorist getLaboratorist() {
        laboratorist.setAllids(sli.allLaboratoristIds());
        laboratorist.setLaboratorist(slv.getLaboratorist());
        return laboratorist;
    }

    public void setLaboratorist(Laboratorist laboratorist) {
        this.laboratorist = laboratorist;
    }

    public String saveLaboratorist() {
        
        
        laboratorist.setId(laboratorist.getId());
        laboratorist.setEmail(laboratorist.getEmail());
        laboratorist.setName(laboratorist.getName());
        laboratorist.setContact(laboratorist.getContact());
        laboratorist.setPassword(laboratorist.getPassword());
        laboratorist.setDod(laboratorist.getDod());
        laboratorist.setGender(laboratorist.getGender());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        laboratorist.setUser(user);
        
        
        if (new AddValues().doSaveLaboratorist(laboratorist)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateLaboratorist() {
        
        
        laboratorist.setId(laboratorist.getId());
        laboratorist.setEmail(laboratorist.getEmail());
        laboratorist.setName(laboratorist.getName());
        laboratorist.setContact(laboratorist.getContact());
        laboratorist.setPassword(laboratorist.getPassword());
        laboratorist.setDod(laboratorist.getDod());
        laboratorist.setGender(laboratorist.getGender());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        laboratorist.setUser(user);
        
        
        if (upd.doUpdateLaboratorist(laboratorist)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteLaboratorist() {
        
        
        laboratorist.setId(laboratorist.getId());
        laboratorist.setEmail(laboratorist.getEmail());
        laboratorist.setName(laboratorist.getName());
        laboratorist.setContact(laboratorist.getContact());
        laboratorist.setPassword(laboratorist.getPassword());
        laboratorist.setDod(laboratorist.getDod());
        laboratorist.setGender(laboratorist.getGender());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        laboratorist.setUser(user);
        dlv.doDeleteLaboratorist(laboratorist);
    }
    public void findLaboratoristById() {
        laboratorist=sbi.findLaboratoristById(laboratorist.getId());
        
        laboratorist.setId(laboratorist.getId());
        laboratorist.setEmail(laboratorist.getEmail());
        laboratorist.setName(laboratorist.getName());
        laboratorist.setContact(laboratorist.getContact());
        laboratorist.setPassword(laboratorist.getPassword());
        laboratorist.setDod(laboratorist.getDod());
        laboratorist.setGender(laboratorist.getGender());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        laboratorist.setUser(user);
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

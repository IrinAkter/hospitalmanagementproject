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
public class AdminBean {
    private Admin admin=new Admin();
    private User user=new User();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv = new SelectValue();
    SelectById sbi = new SelectById();
    DeleteValues dlv=new DeleteValues();

    public Admin getAdmin() {
        admin.setAllids(sli.allAdminIds());
        admin.setAdmin(slv.getAdmin());
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public String saveAdmin(){
        admin.setAdminId(admin.getAdminId());
        admin.setContactNo(admin.getContactNo());
        admin.setEmail(admin.getEmail());
        admin.setName(admin.getName());
        admin.setPassword(admin.getPassword());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        admin.setUser(user);
        
        if(new AddValues().doSaveAdmin(admin)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateAdmin(){
        admin.setAdminId(admin.getAdminId());
        admin.setContactNo(admin.getContactNo());
        admin.setEmail(admin.getEmail());
        admin.setName(admin.getName());
        admin.setPassword(admin.getPassword());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        admin.setUser(user);
        
        if(new AddValues().doSaveAdmin(admin)){
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteAdmin(){
        admin.setAdminId(admin.getAdminId());
        admin.setContactNo(admin.getContactNo());
        admin.setEmail(admin.getEmail());
        admin.setName(admin.getName());
        admin.setPassword(admin.getPassword());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        admin.setUser(user);
        dlv.doDeleteAdmin(admin);
    }
    public void findAdminById() {
        admin = sbi.findAdminById(admin.getAdminId());
        admin.setAdminId(admin.getAdminId());
        admin.setContactNo(admin.getContactNo());
        admin.setEmail(admin.getEmail());
        admin.setName(admin.getName());
        admin.setPassword(admin.getPassword());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());
        
        admin.setUser(user);
        

    }
}

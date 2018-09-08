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
public class UserBean {

    private User user = new User();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv=new SelectValue();
    DeleteValues dlv=new DeleteValues();
    SelectById sbi = new SelectById();

    public User getUser() {
        user.setUser(slv.getUser());
        user.setUsertyp(slv.getUserType());
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String saveUser() {

        user.setId(user.getId());
        user.setUsertype(user.getUsertype());

        if (new AddValues().doSaveUser(user)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateUser() {

        user.setId(user.getId());
        user.setUsertype(user.getUsertype());

        if (upd.doUpdateUser(user)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteUser() {

        user.setId(user.getId());
        user.setUsertype(user.getUsertype());

        dlv.doDeleteUser(user);
    }
    public void findUserById() {
        user=sbi.findUserById(user.getId());
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());

        
    }

}

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
 * @author apcl
 */

public class LoginBean {
    
    private Login login=new Login();
    private User user=new User();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv = new SelectValue();
    SelectById sbi = new SelectById();
    DeleteValues dlv=new DeleteValues();

    public Login getLogin() {
        login.setAllids(sli.allUserLoginIds());
        login.setLogin(slv.getLogin());
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public String saveLogin(){
        login.setUserId(login.getUserId());
        login.setUserName(login.getUserName());
        login.setPassword(login.getPassword());
        
        user.setUsertype(user.getUsertype());
        user.setId(user.getId());
        
        
        login.setUser(user);
        
        
      if(new AddValues().doSaveLogin(login)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }  
    }
    public String updateLogin(){
        login.setUserId(login.getUserId());
        login.setUserName(login.getUserName());
        login.setPassword(login.getPassword());
        
        user.setUsertype(user.getUsertype());
        user.setId(user.getId());
        
        
        login.setUser(user);
        
        
      if(upd.doUpdateLogin(login)){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }  
    }
    public void deleteLogin(){
        login.setUserId(login.getUserId());
        login.setUserName(login.getUserName());
        login.setPassword(login.getPassword());
        
        user.setUsertype(user.getUsertype());
        user.setId(user.getId());
        
        
        login.setUser(user);
        dlv.doDeleteLogin(login);
        
       
    }
    public void findLoginById(){
        login=sbi.findLoginById(login.getUserId());
        login.setUserId(login.getUserId());
        login.setUserName(login.getUserName());
        login.setPassword(login.getPassword());
        
        user.setUsertype(user.getUsertype());
        user.setId(user.getId());
        
        
        login.setUser(user);
        
        
      
    }
     
}

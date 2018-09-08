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
public class ContactBean {

    private Contact contact = new Contact();
    SelectValue sv = new SelectValue();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv = new SelectValue();
    SelectById sbi = new SelectById();
    DeleteValues dlv = new DeleteValues();

    public Contact getContact() {
        contact.setContact(sv.getContact());
        contact.setAllids(sli.allContactIds());
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String saveContact() {
        contact.setId(contact.getId());
        contact.setDepartment(contact.getDepartment());
        contact.setContactno(contact.getContactno());
        if (new AddValues().doSaveContact(contact)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Update"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fail to update"));
            return "error";
        }
    }

    public String updateContact() {
        contact.setId(contact.getId());
        contact.setDepartment(contact.getDepartment());
        contact.setContactno(contact.getContactno());
        if (upd.doUpdateContact(contact)) {
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }

    public void deleteContact() {
        contact.setId(contact.getId());
        contact.setDepartment(contact.getDepartment());
        contact.setContactno(contact.getContactno());
        dlv.doDeleteContact(contact);
    }
    public void findContactById() {
        contact = sbi.findContactById(contact.getId());
        contact.setId(contact.getId());
        contact.setDepartment(contact.getDepartment());
        contact.setContactno(contact.getContactno());

    }
}

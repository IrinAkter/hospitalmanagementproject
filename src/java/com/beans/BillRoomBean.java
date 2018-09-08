/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.dao.AddValues;
import com.dao.SelectById;
import com.dao.SelectIds;
import com.pojo.BillRoom;
import com.pojo.PatientTable;
import com.util.NewHibernateUtil;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Session;

/**
 *
 * @author use
 */

public class BillRoomBean {
    
    private BillRoom bill=new BillRoom();
    SelectIds si=new SelectIds();
    SelectById sbi=new SelectById();

    public BillRoom getBill() {
        bill.setIdList(si.allPatientIds());
        return bill;
    }

    public void setBill(BillRoom bill) {
        this.bill = bill;
    }

}

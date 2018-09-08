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
@ManagedBean
@RequestScoped
public class OutpatientBean {
    private OutpatientTable outpatientTable=new OutpatientTable();
    private LabTable labtable=new LabTable();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv = new SelectValue();
    SelectById sbi = new SelectById();
    DeleteValues dlv=new DeleteValues();

    public OutpatientTable getOutpatientTable() {
        outpatientTable.setAllids(outpatientTable.getAllids());
        outpatientTable.setOutpatient(outpatientTable.getOutpatient());
        return outpatientTable;
    }

    public void setOutpatientTable(OutpatientTable outpatientTable) {
        this.outpatientTable = outpatientTable;
    }

    public LabTable getLabtable() {
        return labtable;
    }

    public void setLabtable(LabTable labtable) {
        this.labtable = labtable;
    }
    public String saveOutpatientTable(){
        outpatientTable.setPid(outpatientTable.getPid());
        outpatientTable.setLabno(outpatientTable.getLabno());
        outpatientTable.setDateOfAdmission(outpatientTable.getDateOfAdmission());
        outpatientTable.setDateOfDischarge(outpatientTable.getDateOfDischarge());
        outpatientTable.setDischargeid(outpatientTable.getDischargeid());
         if(new AddValues().doSaveOutpatient(outpatientTable)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        } 
    }
    public String updateOutpatientTable(){
        outpatientTable.setPid(outpatientTable.getPid());
        outpatientTable.setLabno(outpatientTable.getLabno());
        outpatientTable.setDateOfAdmission(outpatientTable.getDateOfAdmission());
        outpatientTable.setDateOfDischarge(outpatientTable.getDateOfDischarge());
        outpatientTable.setDischargeid(outpatientTable.getDischargeid());
         if(upd.doUpdateOutpatientTable(outpatientTable)){
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteOutpatientTable(){
        outpatientTable.setPid(outpatientTable.getPid());
        outpatientTable.setLabno(outpatientTable.getLabno());
        outpatientTable.setDateOfAdmission(outpatientTable.getDateOfAdmission());
        outpatientTable.setDateOfDischarge(outpatientTable.getDateOfDischarge());
        outpatientTable.setDischargeid(outpatientTable.getDischargeid());
        dlv.doDeleteOutpatientTable(outpatientTable);
         
    }
    public void findOutpatientTableById(){
        outpatientTable=sbi.findOutpatientTableById(outpatientTable.getPid());
        outpatientTable.setPid(outpatientTable.getPid());
        outpatientTable.setLabno(outpatientTable.getLabno());
        outpatientTable.setDateOfAdmission(outpatientTable.getDateOfAdmission());
        outpatientTable.setDateOfDischarge(outpatientTable.getDateOfDischarge());
        outpatientTable.setDischargeid(outpatientTable.getDischargeid());
         
    }
}

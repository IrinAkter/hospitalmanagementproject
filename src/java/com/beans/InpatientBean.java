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
import javax.faces.context.FacesContext;

/**
 *
 * @author use
 */
@ManagedBean
public class InpatientBean {
    private InpatientTable inpatient=new InpatientTable();
    private LabTable lab=new LabTable();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv=new SelectValue();
    DeleteValues dlv=new DeleteValues();
    SelectById sbi = new SelectById();

    public InpatientTable getInpatient() {
        inpatient.setAllids(sli.allInpatientIds());
        inpatient.setInpatient(slv.getInpatient());
        return inpatient;
    }

    public void setInpatient(InpatientTable inpatient) {
        this.inpatient = inpatient;
    }

    public LabTable getLab() {
        return lab;
    }

    public void setLab(LabTable lab) {
        this.lab = lab;
    }
    public String saveInpatient(){
        inpatient.setPid(inpatient.getPid());
        inpatient.setRoomNo(inpatient.getRoomNo());
        inpatient.setLabno(inpatient.getLabno());
        inpatient.setDateOfAdm(inpatient.getDateOfAdm());
        inpatient.setAdvance(inpatient.getAdvance());
        inpatient.setAdmitId(inpatient.getAdmitId());
        if(new AddValues().doSaveInpatient(inpatient)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateInpatient(){
        inpatient.setPid(inpatient.getPid());
        inpatient.setRoomNo(inpatient.getRoomNo());
        inpatient.setLabno(inpatient.getLabno());
        inpatient.setDateOfAdm(inpatient.getDateOfAdm());
        inpatient.setAdvance(inpatient.getAdvance());
        inpatient.setAdmitId(inpatient.getAdmitId());
        if(upd.doUpdateInpatientTable(inpatient)){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteInpatient(){
        inpatient.setPid(inpatient.getPid());
        inpatient.setRoomNo(inpatient.getRoomNo());
        inpatient.setLabno(inpatient.getLabno());
        inpatient.setDateOfAdm(inpatient.getDateOfAdm());
        inpatient.setAdvance(inpatient.getAdvance());
        inpatient.setAdmitId(inpatient.getAdmitId());
        dlv.doDeleteInpatientTable(inpatient);
        
    }
    public void findInpatientById(){
        inpatient=sbi.findInpatientTableById(inpatient.getPid());
        inpatient.setPid(inpatient.getPid());
        inpatient.setRoomNo(inpatient.getRoomNo());
        inpatient.setLabno(inpatient.getLabno());
        inpatient.setDateOfAdm(inpatient.getDateOfAdm());
        inpatient.setAdvance(inpatient.getAdvance());
        inpatient.setAdmitId(inpatient.getAdmitId());
        
    }
    
}

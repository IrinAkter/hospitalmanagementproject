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
public class LabBean {

    private LabTable lab = new LabTable();
    private DoctorTable doctor = new DoctorTable();
    private Laboratorist laboratorist = new Laboratorist();
    private PatientTable patient = new PatientTable();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv = new SelectValue();
    SelectById sbi = new SelectById();
    DeleteValues dlv=new DeleteValues();

    public LabTable getLab() {
        lab.setAllids(sli.allLabIds());
        lab.setLab(slv.getLab());
        return lab;
    }

    public void setLab(LabTable lab) {
        this.lab = lab;
    }

    public DoctorTable getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorTable doctorTable) {
        this.doctor = doctorTable;
    }

    public Laboratorist getLaboratorist() {
        return laboratorist;
    }

    public void setLaboratorist(Laboratorist laboratorist) {
        this.laboratorist = laboratorist;
    }

    public PatientTable getPatient() {
        return patient;
    }

    public void setPatient(PatientTable patient) {
        this.patient = patient;
    }



    public String saveLabTable() {

        lab.setLabno(lab.getLabno());
        lab.setWeight(lab.getWeight());
        lab.setDate(lab.getDate());
        lab.setCategory(lab.getCategory());
        lab.setPatientType(lab.getPatientType());
        lab.setServiceCharge(lab.getServiceCharge());

        doctor.setDoctorid(doctor.getDoctorid());
        doctor.setDoctorname(doctor.getDoctorname());
        doctor.setGender(doctor.getGender());
        doctor.setContactNo(doctor.getContactNo());
        doctor.setEmail(doctor.getEmail());
        doctor.setJoiningDate(doctor.getJoiningDate());
        doctor.setPassword(doctor.getPassword());
        doctor.setDepartment_1(doctor.getDepartment_1());

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

        laboratorist.setId(laboratorist.getId());
        laboratorist.setEmail(laboratorist.getEmail());
        laboratorist.setName(laboratorist.getName());
        laboratorist.setContact(laboratorist.getContact());
        laboratorist.setPassword(laboratorist.getPassword());
        laboratorist.setDod(laboratorist.getDod());
        laboratorist.setGender(laboratorist.getGender());
                
        lab.setDoctorTable(doctor);
        lab.setPatientTable(patient);
        lab.setLaboratorist(laboratorist);

        if (new AddValues().doSaveLab(lab)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateLabTable() {

        lab.setLabno(lab.getLabno());
        lab.setWeight(lab.getWeight());
        lab.setDate(lab.getDate());
        lab.setCategory(lab.getCategory());
        lab.setPatientType(lab.getPatientType());
        lab.setServiceCharge(lab.getServiceCharge());

        doctor.setDoctorid(doctor.getDoctorid());
        doctor.setDoctorname(doctor.getDoctorname());
        doctor.setGender(doctor.getGender());
        doctor.setContactNo(doctor.getContactNo());
        doctor.setEmail(doctor.getEmail());
        doctor.setJoiningDate(doctor.getJoiningDate());
        doctor.setPassword(doctor.getPassword());
        doctor.setDepartment_1(doctor.getDepartment_1());

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

        laboratorist.setId(laboratorist.getId());
        laboratorist.setEmail(laboratorist.getEmail());
        laboratorist.setName(laboratorist.getName());
        laboratorist.setContact(laboratorist.getContact());
        laboratorist.setPassword(laboratorist.getPassword());
        laboratorist.setDod(laboratorist.getDod());
        laboratorist.setGender(laboratorist.getGender());
                
        lab.setDoctorTable(doctor);
        lab.setPatientTable(patient);
        lab.setLaboratorist(laboratorist);

        if (upd.doUpdateLabTable(lab)) {
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteLabTable() {

        lab.setLabno(lab.getLabno());
        lab.setWeight(lab.getWeight());
        lab.setDate(lab.getDate());
        lab.setCategory(lab.getCategory());
        lab.setPatientType(lab.getPatientType());
        lab.setServiceCharge(lab.getServiceCharge());

        doctor.setDoctorid(doctor.getDoctorid());
        doctor.setDoctorname(doctor.getDoctorname());
        doctor.setGender(doctor.getGender());
        doctor.setContactNo(doctor.getContactNo());
        doctor.setEmail(doctor.getEmail());
        doctor.setJoiningDate(doctor.getJoiningDate());
        doctor.setPassword(doctor.getPassword());
        doctor.setDepartment_1(doctor.getDepartment_1());

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

        laboratorist.setId(laboratorist.getId());
        laboratorist.setEmail(laboratorist.getEmail());
        laboratorist.setName(laboratorist.getName());
        laboratorist.setContact(laboratorist.getContact());
        laboratorist.setPassword(laboratorist.getPassword());
        laboratorist.setDod(laboratorist.getDod());
        laboratorist.setGender(laboratorist.getGender());
                
        lab.setDoctorTable(doctor);
        lab.setPatientTable(patient);
        lab.setLaboratorist(laboratorist);
        dlv.doDeleteLabTable(lab);
        
    }
    public void findLabTableById() {
        lab=sbi.findLabTableById(lab.getLabno());
        
        lab.setLabno(lab.getLabno());
        lab.setWeight(lab.getWeight());
        lab.setDate(lab.getDate());
        lab.setCategory(lab.getCategory());
        lab.setPatientType(lab.getPatientType());
        lab.setServiceCharge(lab.getServiceCharge());

        doctor.setDoctorid(doctor.getDoctorid());
        doctor.setDoctorname(doctor.getDoctorname());
        doctor.setGender(doctor.getGender());
        doctor.setContactNo(doctor.getContactNo());
        doctor.setEmail(doctor.getEmail());
        doctor.setJoiningDate(doctor.getJoiningDate());
        doctor.setPassword(doctor.getPassword());
        doctor.setDepartment_1(doctor.getDepartment_1());

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

        laboratorist.setId(laboratorist.getId());
        laboratorist.setEmail(laboratorist.getEmail());
        laboratorist.setName(laboratorist.getName());
        laboratorist.setContact(laboratorist.getContact());
        laboratorist.setPassword(laboratorist.getPassword());
        laboratorist.setDod(laboratorist.getDod());
        laboratorist.setGender(laboratorist.getGender());
                
        lab.setDoctorTable(doctor);
        lab.setPatientTable(patient);
        lab.setLaboratorist(laboratorist);

    }

    public void changeField(){
        if(lab.getLabno().equalsIgnoreCase("Labno-1")){
            lab.setCategory("Autopsy services");
            lab.setLabcharges(5000);
            lab.setServiceCharge(5000+(5000/100*3));
        }
        if(lab.getLabno().equalsIgnoreCase("Labno-2")){
            lab.setCategory("Blood bank and transfusion services");
            lab.setLabcharges(4000);
            lab.setServiceCharge(4000+(4000/100*3));
        }
        if(lab.getLabno().equalsIgnoreCase("Labno-3")){
            lab.setCategory("Blood collection");
            lab.setLabcharges(6000);
            lab.setServiceCharge(6000+(6000/100*3));
        }
        if(lab.getLabno().equalsIgnoreCase("Labno-4")){
            lab.setCategory("Clinical chemistry");
            lab.setLabcharges(7000+(7000/100*3));
        }
        if(lab.getLabno().equalsIgnoreCase("Labno-5")){
            lab.setCategory("Microbiology");
            lab.setLabcharges(10000+(10000/100*3));
        }
        if(lab.getLabno().equalsIgnoreCase("Labno-6")){
            lab.setCategory("Surgical pathology");
            lab.setLabcharges(15000+(15000/100*3));
        }
        
    }
}

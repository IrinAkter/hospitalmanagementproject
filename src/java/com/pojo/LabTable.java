package com.pojo;
// Generated Aug 2, 2016 7:42:26 PM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LabTable generated by hbm2java
 */
public class LabTable  implements java.io.Serializable {


     private String labno;
     private DoctorTable doctorTable;
     private Laboratorist laboratorist;
     private PatientTable patientTable;
     private int weight;
     private Date date;
     private String category;
     private String patientType;
     private double labcharges;
     private double serviceCharge;
     private Set outpatientTables = new HashSet(0);
     private Set inpatientTables = new HashSet(0);
     private List<String> allids=new ArrayList<String>();
     private List<LabTable> lab=new ArrayList<LabTable>();

    public LabTable() {
    }

	
    public LabTable(String labno, DoctorTable doctorTable, Laboratorist laboratorist, PatientTable patientTable, int weight, Date date, String category, String patientType, double serviceCharge) {
        this.labno = labno;
        this.doctorTable = doctorTable;
        this.laboratorist = laboratorist;
        this.patientTable = patientTable;
        this.weight = weight;
        this.date = date;
        this.category = category;
        this.patientType = patientType;
        this.serviceCharge = serviceCharge;
    }
    public LabTable(String labno, DoctorTable doctorTable, Laboratorist laboratorist, PatientTable patientTable, int weight, Date date, String category, String patientType, double serviceCharge, Set outpatientTables, Set inpatientTables) {
       this.labno = labno;
       this.doctorTable = doctorTable;
       this.laboratorist = laboratorist;
       this.patientTable = patientTable;
       this.weight = weight;
       this.date = date;
       this.category = category;
       this.patientType = patientType;
       this.serviceCharge = serviceCharge;
       this.outpatientTables = outpatientTables;
       this.inpatientTables = inpatientTables;
    }
   
    public String getLabno() {
        return this.labno;
    }
    
    public void setLabno(String labno) {
        this.labno = labno;
    }
    public DoctorTable getDoctorTable() {
        return this.doctorTable;
    }
    
    public void setDoctorTable(DoctorTable doctorTable) {
        this.doctorTable = doctorTable;
    }
    public Laboratorist getLaboratorist() {
        return this.laboratorist;
    }
    
    public void setLaboratorist(Laboratorist laboratorist) {
        this.laboratorist = laboratorist;
    }
    public PatientTable getPatientTable() {
        return this.patientTable;
    }
    
    public void setPatientTable(PatientTable patientTable) {
        this.patientTable = patientTable;
    }
    public int getWeight() {
        return this.weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public String getPatientType() {
        return this.patientType;
    }
    
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }
    public double getServiceCharge() {
        return this.serviceCharge;
    }
    
    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    public Set getOutpatientTables() {
        return this.outpatientTables;
    }
    
    public void setOutpatientTables(Set outpatientTables) {
        this.outpatientTables = outpatientTables;
    }
    public Set getInpatientTables() {
        return this.inpatientTables;
    }
    
    public void setInpatientTables(Set inpatientTables) {
        this.inpatientTables = inpatientTables;
    }

    public List<String> getAllids() {
        return allids;
    }

    public void setAllids(List<String> allids) {
        this.allids = allids;
    }

    public List<LabTable> getLab() {
        return lab;
    }

    public void setLab(List<LabTable> lab) {
        this.lab = lab;
    }

    public double getLabcharges() {
        return labcharges;
    }

    public void setLabcharges(double labcharges) {
        this.labcharges = labcharges;
    }




}


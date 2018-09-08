package com.pojo;
// Generated Aug 2, 2016 7:42:26 PM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department  implements java.io.Serializable {


     private int deptId;
     private String deptName;
     private String managerId;
     private String location;
     private Set pharmasists = new HashSet(0);
     private Set receptionists = new HashSet(0);
     private Set doctorTables = new HashSet(0);
     private Set nurses = new HashSet(0);
     private Set accountants = new HashSet(0);
     private List<String> allDept=new ArrayList<String>();
     private List<Integer> allids=new ArrayList<>();

    public Department() {
    }

	
    public Department(int deptId) {
        this.deptId = deptId;
    }
    public Department(int deptId, String deptName, String managerId, String location, Set pharmasists, Set receptionists, Set doctorTables, Set nurses, Set accountants) {
       this.deptId = deptId;
       this.deptName = deptName;
       this.managerId = managerId;
       this.location = location;
       this.pharmasists = pharmasists;
       this.receptionists = receptionists;
       this.doctorTables = doctorTables;
       this.nurses = nurses;
       this.accountants = accountants;
    }
   
    public int getDeptId() {
        return this.deptId;
    }
    
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return this.deptName;
    }
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public Set getPharmasists() {
        return this.pharmasists;
    }
    
    public void setPharmasists(Set pharmasists) {
        this.pharmasists = pharmasists;
    }
    public Set getReceptionists() {
        return this.receptionists;
    }
    
    public void setReceptionists(Set receptionists) {
        this.receptionists = receptionists;
    }
    public Set getDoctorTables() {
        return this.doctorTables;
    }
    
    public void setDoctorTables(Set doctorTables) {
        this.doctorTables = doctorTables;
    }
    public Set getNurses() {
        return this.nurses;
    }
    
    public void setNurses(Set nurses) {
        this.nurses = nurses;
    }
    public Set getAccountants() {
        return this.accountants;
    }
    
    public void setAccountants(Set accountants) {
        this.accountants = accountants;
    }

    public List<String> getAllDept() {
        return allDept;
    }

    public void setAllDept(List<String> allDept) {
        this.allDept = allDept;
    }

    public List<Integer> getAllids() {
        return allids;
    }

    public void setAllids(List<Integer> allids) {
        this.allids = allids;
    }






}



package com.pojo;
// Generated Aug 2, 2016 7:42:26 PM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Pharmasist generated by hbm2java
 */
public class Pharmasist  implements java.io.Serializable {


     private int id;
     private Department department;
     private EmployeeTable employeeTable;
     private User user;
     private String name;
     private String emai;
     private String contact;
     private String password;
     private String gender;
     private Date dob;
     private String empid;
     private int deptid;
      private List<Pharmasist> pharmasist=new ArrayList<Pharmasist>();
     private List<Integer> allIds=new ArrayList<Integer>();

    public Pharmasist() {
    }

	
    public Pharmasist(int id, Department department, EmployeeTable employeeTable, User user, String name, String emai, String contact, String password, String gender, Date dob, String empid, int deptid) {
        this.id = id;
        this.department = department;
        this.employeeTable = employeeTable;
        this.user = user;
        this.name = name;
        this.emai = emai;
        this.contact = contact;
        this.password = password;
        this.gender = gender;
        this.dob = dob;
        this.empid = empid;
        this.deptid = deptid;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
    public EmployeeTable getEmployeeTable() {
        return this.employeeTable;
    }
    
    public void setEmployeeTable(EmployeeTable employeeTable) {
        this.employeeTable = employeeTable;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmai() {
        return this.emai;
    }
    
    public void setEmai(String emai) {
        this.emai = emai;
    }
    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmpid() {
        return this.empid;
    }
    
    public void setEmpid(String empid) {
        this.empid = empid;
    }
    public int getDeptid() {
        return this.deptid;
    }
    
    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public List<Pharmasist> getPharmasist() {
        return pharmasist;
    }

    public void setPharmasist(List<Pharmasist> pharmasist) {
        this.pharmasist = pharmasist;
    }

    public List<Integer> getAllIds() {
        return allIds;
    }

    public void setAllIds(List<Integer> allIds) {
        this.allIds = allIds;
    }




}


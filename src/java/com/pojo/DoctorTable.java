package com.pojo;
// Generated Aug 2, 2016 7:42:26 PM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * DoctorTable generated by hbm2java
 */
public class DoctorTable  implements java.io.Serializable {


     private String doctorid;
     private Department department;
     private EmployeeTable employeeTable;
     private User user;
     private String doctorname;
     private String gender;
     private String contactNo;
     private String email;
     private Date joiningDate;
     private String password;
     private String department_1;
     private List<String> specialf=new ArrayList<String>();
     private List<String> allids=new ArrayList<String>();
     private List<DoctorTable> doctor=new ArrayList<DoctorTable>();

    public DoctorTable() {
    }

	
    public DoctorTable(String doctorid, Department department, EmployeeTable employeeTable, User user, String gender, String contactNo, String email, Date joiningDate, String username, String password, String department_1) {
        this.doctorid = doctorid;
        this.department = department;
        this.employeeTable = employeeTable;
        this.user = user;
        this.doctorname = doctorname;
        this.gender = gender;
        this.contactNo = contactNo;
        this.email = email;
        this.joiningDate = joiningDate;
        this.password = password;
        this.department_1 = department_1;
    }
  
   
    public String getDoctorid() {
        return this.doctorid;
    }
    
    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
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
    public String getDoctorname() {
        return this.doctorname;
    }
    
    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return this.contactNo;
    }
    
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getJoiningDate() {
        return this.joiningDate;
    }
    
    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDepartment_1() {
        return this.department_1;
    }
    
    public void setDepartment_1(String department_1) {
        this.department_1 = department_1;
    }


    public List<String> getSpecialf() {
        return specialf;
    }

    public void setSpecialf(List<String> specialf) {
        this.specialf = specialf;
    }

    public List<DoctorTable> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<DoctorTable> doctor) {
        this.doctor = doctor;
    }

    public List<String> getAllids() {
        return allids;
    }

    public void setAllids(List<String> allids) {
        this.allids = allids;
    }


}



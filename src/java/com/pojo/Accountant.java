package com.pojo;
// Generated Aug 2, 2016 7:42:26 PM by Hibernate Tools 4.3.1


import com.dao.AddValues;
import com.dao.DeleteValues;
import com.dao.SelectById;
import com.dao.SelectIds;
import com.dao.UpdateValues;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Accountant generated by hbm2java
 */

public class Accountant  implements java.io.Serializable {


     private int id;
     private Department department;
     private EmployeeTable employeeTable;
     private User user;
     private String name;
     private String email;
     private String contactno;
     private String password;
     private String gender;
     private Date dob;
     private List<Integer> allids=new ArrayList<>();
     private List<Accountant> accountant=new ArrayList<>();
    public Accountant() {
    }

	
    public Accountant(int id, Department department, EmployeeTable employeeTable, User user, String name, String email, String contactno, String password, String gender, Date dob) {
        this.id = id;
        this.department = department;
        this.employeeTable = employeeTable;
        this.user = user;
        this.name = name;
        this.email = email;
        this.contactno = contactno;
        this.password = password;
        this.gender = gender;
        this.dob = dob;
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
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContactno() {
        return this.contactno;
    }
    
    public void setContactno(String contactno) {
        this.contactno = contactno;
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

    public List<Integer> getAllids() {
        return allids;
    }

    public void setAllids(List<Integer> allids) {
        this.allids = allids;
    }

    public List<Accountant> getAccountant() {
        return accountant;
    }

    public void setAccountant(List<Accountant> accountant) {
        this.accountant = accountant;
    }

//public void findStudentById(){
//    ac=slbi.findAccountantById(id);
//    this.id=ac.id;
//    this.name=ac.name;
//    this.email=ac.email;
//    this.contactno=ac.contactno;
//    this.password=ac.password;
//    this.gender=ac.gender;
//    this.dob=ac.dob;
//    
//}
// public void doInsert(){
//        AddValues adv=new AddValues();
//        adv.doSaveAccountant(ac);
//    }
//    public void doUpdate(){
//        UpdateValues updv=new UpdateValues();
//        updv.doUpdateAccountant(ac);
//    }
//    public void doDelete(){
//        DeleteValues delv=new DeleteValues();
//        delv.doDeleteAccountant(ac);
//    }
//
//

}



package com.pojo;
// Generated Aug 2, 2016 7:42:26 PM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;




/**
 * Contact generated by hbm2java
 */
public class Contact  implements java.io.Serializable {


     private int id;
     private String department;
     private String contactno;
     private List<Contact> contact=new ArrayList<Contact>();
     private List<Integer> allids=new ArrayList<>();

    public Contact() {
    }

    public Contact(int id, String department, String contactno) {
       this.id = id;
       this.department = department;
       this.contactno = contactno;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getContactno() {
        return this.contactno;
    }
    
    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public List<Integer> getAllids() {
        return allids;
    }

    public void setAllids(List<Integer> allids) {
        this.allids = allids;
    }

}



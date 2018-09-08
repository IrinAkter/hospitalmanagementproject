package com.pojo;
// Generated Aug 2, 2016 7:42:26 PM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

    private String usertype;
    private int id;
    private Set receptionists = new HashSet(0);
    private Set pharmasists = new HashSet(0);
    private Set doctorTables = new HashSet(0);
    private Set laboratorists = new HashSet(0);
    private Set patientTables = new HashSet(0);
    private Set admins = new HashSet(0);
    private Set accountants = new HashSet(0);
    private Set logins = new HashSet(0);
    private Set nurses = new HashSet(0);
    
    private List<Integer> allIds = new ArrayList<Integer>();
    private List<String> usertyp = new ArrayList<String>();
    private List<User> user = new ArrayList<User>();

    public User() {
    }

    public User(String usertype, int id) {
        this.usertype = usertype;
        this.id = id;
    }

    public User(String usertype, int id, Set receptionists, Set pharmasists, Set doctorTables, Set laboratorists, Set patientTables, Set admins, Set accountants, Set logins, Set nurses) {
        this.usertype = usertype;
        this.id = id;
        this.receptionists = receptionists;
        this.pharmasists = pharmasists;
        this.doctorTables = doctorTables;
        this.laboratorists = laboratorists;
        this.patientTables = patientTables;
        this.admins = admins;
        this.accountants = accountants;
        this.logins = logins;
        this.nurses = nurses;
    }

    public String getUsertype() {
        return this.usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set getReceptionists() {
        return this.receptionists;
    }

    public void setReceptionists(Set receptionists) {
        this.receptionists = receptionists;
    }

    public Set getPharmasists() {
        return this.pharmasists;
    }

    public void setPharmasists(Set pharmasists) {
        this.pharmasists = pharmasists;
    }

    public Set getDoctorTables() {
        return this.doctorTables;
    }

    public void setDoctorTables(Set doctorTables) {
        this.doctorTables = doctorTables;
    }

    public Set getLaboratorists() {
        return this.laboratorists;
    }

    public void setLaboratorists(Set laboratorists) {
        this.laboratorists = laboratorists;
    }

    public Set getPatientTables() {
        return this.patientTables;
    }

    public void setPatientTables(Set patientTables) {
        this.patientTables = patientTables;
    }

    public Set getAdmins() {
        return this.admins;
    }

    public void setAdmins(Set admins) {
        this.admins = admins;
    }

    public Set getAccountants() {
        return this.accountants;
    }

    public void setAccountants(Set accountants) {
        this.accountants = accountants;
    }

    public Set getLogins() {
        return this.logins;
    }

    public void setLogins(Set logins) {
        this.logins = logins;
    }

    public Set getNurses() {
        return this.nurses;
    }

    public void setNurses(Set nurses) {
        this.nurses = nurses;
    }


    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<String> getUsertyp() {
        return usertyp;
    }

    public void setUsertyp(List<String> usertyp) {
        this.usertyp = usertyp;
    }

    public List<Integer> getAllIds() {
        return allIds;
    }

    public void setAllIds(List<Integer> allIds) {
        this.allIds = allIds;
    }



}

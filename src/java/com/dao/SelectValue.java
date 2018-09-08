/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import com.pojo.*;
import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author use
 */
@ManagedBean
public class SelectValue {

    public List<Contact> getContact() {
        List<Contact> contact = new ArrayList<Contact>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        contact=s.createCriteria(Contact.class).list();
        s.close();
        return contact;
    }
    public List<Accountant> getAccountant() {
        List<Accountant> act = new ArrayList<Accountant>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        act = s.createCriteria(Accountant.class).list();
        s.close();
        return act;
    }
    public List<Admin> getAdmin() {
        List<Admin> admin = new ArrayList<Admin>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        admin = s.createCriteria(Admin.class).list();
        s.close();
        return admin;
    }
    public List<BillRoom> getBill() {
        List<BillRoom> bill = new ArrayList<BillRoom>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        bill = s.createCriteria(BillRoom.class).list();
        s.close();
        return bill;
    }
    public List<Department> getDepartment() {
        List<Department> dept = new ArrayList<Department>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        dept = s.createCriteria(Department.class).list();
        s.close();
        return dept;
    }
    public List<DoctorTable> getDoctor() {
        List<DoctorTable> doct = new ArrayList<DoctorTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        doct = s.createCriteria(DoctorTable.class).list();
        s.close();
        return doct;
    }
    public List<EmployeeTable> getEmployee() {
        List<EmployeeTable> emp = new ArrayList<EmployeeTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        emp = s.createCriteria(EmployeeTable.class).list();
        s.close();
        return emp;
    }
    public List<InpatientTable> getInpatient() {
        List<InpatientTable> inp = new ArrayList<InpatientTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        inp = s.createCriteria(InpatientTable.class).list();
        s.close();
        return inp;
    }
    public List<LabTable> getLab() {
        List<LabTable> lab = new ArrayList<LabTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        lab = s.createCriteria(LabTable.class).list();
        s.close();
        return lab;
    }
    public List<Laboratorist> getLaboratorist() {
        List<Laboratorist> labtor = new ArrayList<Laboratorist>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        labtor = s.createCriteria(LabTable.class).list();
        s.close();
        return labtor;
    }
    public List<Login> getLogin() {
        List<Login> log = new ArrayList<Login>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        log = s.createCriteria(Login.class).list();
        s.close();
        return log;
    }
    public List<OutpatientTable> getOutp() {
        List<OutpatientTable> outp = new ArrayList<OutpatientTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        outp = s.createCriteria(OutpatientTable.class).list();
        s.close();
        return outp;
    }
    public List<PatientTable> getPatient() {
        List<PatientTable> ptnt = new ArrayList<PatientTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        ptnt = s.createCriteria(PatientTable.class).list();
        s.close();
        return ptnt;
    }
    public List<Receptionist> getRecep() {
        List<Receptionist> recept = new ArrayList<Receptionist>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        recept = s.createCriteria(Receptionist.class).list();
        s.close();
        return recept;
    }
    public List<RoomTable> getRoom() {
        List<RoomTable> room = new ArrayList<RoomTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        room = s.createCriteria(RoomTable.class).list();
        s.close();
        return room;
    }
    public List<Pharmasist> getPharmecy() {
        List<Pharmasist> phar = new ArrayList<Pharmasist>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        phar = s.createCriteria(Pharmasist.class).list();
        s.close();
        return phar;
    }
    public List<Nurse> getNurse() {
        List<Nurse> nurse = new ArrayList<Nurse>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        nurse = s.createCriteria(Nurse.class).list();
        s.close();
        return nurse;
    }
    public List<User> getUser() {
        List<User> user = new ArrayList<User>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        user = s.createCriteria(User.class).list();
        s.close();
        return user;
    }
    public List<String> getUserType() {
        List<String> allUser = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("Select usertype From User");
        allUser=q.list();
        s.close();
        return allUser;
    }
    public List<String> getDepartmentName(){
        List<String> deptName = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("Select deptName from Department");
        deptName=q.list();
        s.close();
        return deptName;
    }
    public List<String> getDoctorName(){
        List<String> docttName = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("Select doctorname from DoctorTable WHERE doctorid=:(SELECT doctorid from PatientTable)");
        docttName=q.list();
        s.close();
        return docttName;
    }

}

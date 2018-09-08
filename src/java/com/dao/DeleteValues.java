/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import com.pojo.*;
import com.util.NewHibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author use
 */
public class DeleteValues {
    
    public void doDeleteUser(User user) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(user);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteRoom(RoomTable room) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(room);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteReceptionist(Receptionist recep) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(recep);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeletePatientTable(PatientTable patient) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(patient);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteOutpatientTable(OutpatientTable outpatientTable) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(outpatientTable);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteLogin(Login login) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(login);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteLaboratorist(Laboratorist lab) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(lab);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteLabTable(LabTable labt) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(labt);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteInpatientTable(InpatientTable inp) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(inp);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteEmployeeTable(EmployeeTable emp) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(emp);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteDoctorTable(DoctorTable doctor) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(doctor);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteDepartment(Department dept) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(dept);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteContact(Contact contact) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(contact);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteBillRoom(BillRoom billr) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(billr);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteAdmin(Admin admin) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(admin);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteAccountant(Accountant acc) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(acc);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeletePharmasist(Pharmasist pharmasist) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(pharmasist);
        s.getTransaction().commit();
        s.close();
    }
    public void doDeleteNurse(Nurse nurse) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(nurse);
        s.getTransaction().commit();
        s.close();
    }
    
}

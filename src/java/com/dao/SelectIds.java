/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author use
 */
public class SelectIds {

    public List<Integer> allAccountantIds() {
        List<Integer> idList = new ArrayList<Integer>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select id From Accountant");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<Integer> allAdminIds() {
        List<Integer> idList = new ArrayList<Integer>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select adminId From Admin");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<Integer> allBillIds() {
        List<Integer> idList = new ArrayList<Integer>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select billNo From BillRoom");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<Integer> allContactIds() {
        List<Integer> idList = new ArrayList<Integer>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select id From Contact");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<Integer> allDepartmentIds() {
        List<Integer> idList = new ArrayList<Integer>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select deptId From Department");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<String> allDoctorIds() {
        List<String> idList = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select doctorid From DoctorTable");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<String> allEmployeeIds() {
        List<String> idList = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select employeeId From EmployeeTable");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<String> allInpatientIds() {
        List<String> idList = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select pid From InpatientTable");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<String> allLabIds() {
        List<String> idList = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select labno From LabTable");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<Integer> allLaboratoristIds() {
        List<Integer> idList = new ArrayList<Integer>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select id From Laboratorist");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<String> allOutpatientIds() {
        List<String> idList = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select pid From OutpatientTable");
        idList = q.list();
        return idList;
    }
    public List<String> allPatientIds() {
        List<String> idList = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select pid From PatientTable");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<String> allRoomIds() {
        List<String> idList = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select roomNo From RoomTable");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<Integer> allUserLoginIds() {
        List<Integer> idList = new ArrayList<Integer>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select userId From Login");
        idList = q.list();
        return idList;
    }
    public List<Integer> allReceptionistIds() {
        List<Integer> idList = new ArrayList<Integer>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select recId From Receptionist");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<Integer> allUserIds() {
        List<Integer> idList = new ArrayList<Integer>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select id From User");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<Integer> allPharmasistIds() {
        List<Integer> idList = new ArrayList<Integer>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select id From Pharmasist");
        idList = q.list();
        s.close();
        return idList;
    }
    public List<String> allNurseIds() {
        List<String> idList = new ArrayList<String>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("Select nurseid From Nurse");
        idList = q.list();
        s.close();
        return idList;
    }
}

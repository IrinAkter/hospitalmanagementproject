
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author apcl
 */
public class CheckLogin {
        public boolean checkLoginAccountant(String user, String password) {
        boolean userFound = false;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Accountant where name=:n and password=:p");
        query.setParameter("n", user);
        query.setParameter("p", password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        session.close();
        return userFound;
    }

    public boolean checkLoginAdmin(String user, String password) {
        boolean userFound = false;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Admin where name=:n and password=:p");
        query.setParameter("n", user);
        query.setParameter("p", password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        session.close();
        return userFound;
    }
    public boolean checkDoctor(String user, String password) {
        boolean userFound = false;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from DoctorTable where doctorname=:n and password=:p");
        query.setParameter("n", user);
        query.setParameter("p", password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        session.close();
        return userFound;
    }
    public boolean checkPatient (String user, String password) {
        boolean userFound = false;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from PatientTable where pname=:n and password=:p");
        query.setParameter("n", user);
        query.setParameter("p", password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        session.close();
        return userFound;
    }
    public boolean checkNurse (String user, String password) {
        boolean userFound = false;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Nurse where nursename=:n and password=:p");
        query.setParameter("n", user);
        query.setParameter("p", password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        session.close();
        return userFound;
    }
    public boolean checkReceptionist (String user, String password) {
        boolean userFound = false;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Receptionist where recName=:n and recPassword=:p");
        query.setParameter("n", user);
        query.setParameter("p", password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        session.close();
        return userFound;
    }
    public boolean checkPharmacist (String user, String password) {
        boolean userFound = false;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Pharmasist where name=:n and password=:p");
        query.setParameter("n", user);
        query.setParameter("p", password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        session.close();
        return userFound;
    }
    public boolean checkLaboratorist (String user, String password) {
        boolean userFound = false;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Laboratorist where name=:n and password=:p");
        query.setParameter("n", user);
        query.setParameter("p", password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        session.close();
        return userFound;
    }
    
}

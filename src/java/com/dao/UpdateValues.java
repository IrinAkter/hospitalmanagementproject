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
public class UpdateValues {

    public boolean doUpdateUser(User user) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(user);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateRoom(RoomTable room) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(room);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateReceptionist(Receptionist recep) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(recep);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdatePatientTable(PatientTable patient) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(patient);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateOutpatientTable(OutpatientTable outpatientTable) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(outpatientTable);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateLogin(Login login) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(login);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateLaboratorist(Laboratorist lab) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(lab);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateLabTable(LabTable labt) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(labt);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateInpatientTable(InpatientTable inp) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(inp);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateEmployeeTable(EmployeeTable emp) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(emp);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateDoctorTable(DoctorTable doctor) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(doctor);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateDepartment(Department dept) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(dept);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateContact(Contact contact) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(contact);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateBillRoom(BillRoom billr) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(billr);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateAdmin(Admin admin) {
        try {

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(admin);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateAccountant(Accountant acc) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(acc);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdatePharmasist(Pharmasist phar) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(phar);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doUpdateNurse(Nurse nurse) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(nurse);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}

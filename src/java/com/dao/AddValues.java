/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.*;
import com.util.NewHibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import org.hibernate.Session;

/**
 *
 * @author use
 */
@ManagedBean
public class AddValues {

    Connection con = new ConnectDb().connectDB();

    public void doSaveUser(int id, String usertype) {
        try {
            PreparedStatement pstmt = con.prepareStatement("Insert into user(id, usertype) values(?,?)");
            pstmt.setInt(1, id);
            pstmt.setString(2, usertype);
            int n = pstmt.executeUpdate();
            con.close();
        } catch (Exception e) {

        }
    }

//    public void doSaveAdmin(int adminid, String name, String email, String contactno, String password, String usertype) {
//        try {
//            PreparedStatement pstmt = con.prepareStatement("Insert into admin(admin_id, name, email, contact_no, password, usertype) values(?,?,?,?,?,?)");
//            pstmt.setInt(1, adminid);
//            pstmt.setString(2, name);
//            pstmt.setString(3, email);
//            pstmt.setString(4, contactno);
//            pstmt.setString(5, password);
//            pstmt.setString(6, usertype);
//            int n = pstmt.executeUpdate();
//            con.close();
//        } catch (Exception e) {
//
//        }
//    }
    public boolean doSaveAccountant(Accountant act) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(act);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean doSaveUser(User user) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(user);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSaveAdmin(Admin adm) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(adm);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSaveContact(Contact contact) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(contact);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doDepartment(Department department) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(department);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

//    public void doSaveContact(int id, String department, String contactno) {
//        try {
//            PreparedStatement pstmt = con.prepareStatement("Insert into user(id, department, contactno) values(?,?,?)");
//            pstmt.setInt(1, id);
//            pstmt.setString(2, department);
//            pstmt.setString(2, contactno);
//            int n = pstmt.executeUpdate();
//            con.close();
//        } catch (Exception e) {
//
//        }
//    }
//    public void doSaveDepartment(int deptId, String deptName, String managerId, String location) {
//        try {
//            PreparedStatement pstmt = con.prepareStatement("Insert into department(dept_id, dept_name, manager_id, location) values(?,?,?,?)");
//            pstmt.setInt(1, deptId);
//            pstmt.setString(2, deptName);
//            pstmt.setString(3, managerId);
//            pstmt.setString(4, location);
//            int n = pstmt.executeUpdate();
//            con.close();
//        } catch (Exception e) {
//
//        }
//    }
    public boolean doAddDoctor(DoctorTable doct) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(doct);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doAddBill(int dischargeId, String billingDate, Double roomCharges, Double serviceCharges, Double chargesPaid, Double dueCharges, double totalCharges, Integer noOfDays, Double totalRoomCharges) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            BillRoom blr=new BillRoom(dischargeId, billingDate, roomCharges, serviceCharges, chargesPaid, dueCharges, totalCharges, noOfDays, totalRoomCharges);
            s.save(blr);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSaveEmployee(EmployeeTable emp) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(emp);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSaveInpatient(InpatientTable inp) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(inp);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSaveLab(LabTable lab) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(lab);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSaveLaboratorist(Laboratorist labtst) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(labtst);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSaveLogin(Login log) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(log);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSaveOutpatient(OutpatientTable outp) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(outp);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSavePatient(PatientTable pt) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(pt);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSavePharmacist(Pharmasist pharmasist) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(pharmasist);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;

        }
    }

    public boolean doSaveReceptionist(Receptionist recpt) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(recpt);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean doSaveRoom(RoomTable room) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(room);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean doSaveNurse(Nurse nurse) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(nurse);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

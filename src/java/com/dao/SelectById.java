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
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author use
 */
public class SelectById {

    public Accountant findAccountantById(int id) {
        Accountant acnt = new Accountant();
        List<Accountant> acc = new ArrayList<Accountant>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From Accountant Where id=:p");
        q.setInteger("p", id);
        acc = q.list();
        acnt = acc.get(0);
        s.close();
        return acnt;
    }
    public Admin findAdminById(int id) {
        Admin admin = new Admin();
        List<Admin> adm = new ArrayList<Admin>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From Admin Where adminId=:p");
        q.setInteger("p", id);
        adm = q.list();
        admin = adm.get(0);
        s.close();
        return admin;
    }
    public BillRoom findBillById(Integer billno) {
        BillRoom bill = new BillRoom();
        List<BillRoom> bln = new ArrayList<BillRoom>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From BillRoom Where adminId=:p");
        q.setInteger("p", billno);
        bln = q.list();
        bill = bln.get(0);
        s.close();
        return bill;
    }
    public Contact findContactById(int id) {
        Contact contact = new Contact();
        List<Contact> cont = new ArrayList<Contact>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From Contact Where id=:p");
        q.setInteger("p", id);
        cont = q.list();
        contact = cont.get(0);
        s.close();
        return contact;
    }
    public Department findDepartmentById(int id) {
        Department department = new Department();
        List<Department> dept = new ArrayList<Department>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From Department Where deptId=:p");
        q.setInteger("p", id);
        dept = q.list();
        department = dept.get(0);
        s.close();
        return department;
    }
    public DoctorTable findDoctorTableById(String id) {
        DoctorTable doctor = new DoctorTable();
        List<DoctorTable> doct = new ArrayList<DoctorTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From DoctorTable Where doctorid=:p");
        q.setString("p", id);
        doct = q.list();
        doctor = doct.get(0);
        s.close();
        return doctor;
    }
    public EmployeeTable findEmployeeTableById(String id) {
        EmployeeTable employee = new EmployeeTable();
        List<EmployeeTable> emp = new ArrayList<EmployeeTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From EmployeeTable Where employeeId=:p");
        q.setString("p", id);
        emp = q.list();
        employee = emp.get(0);
        s.close();
        return employee;
    }
    public InpatientTable findInpatientTableById(String id) {
        InpatientTable inpatient = new InpatientTable();
        List<InpatientTable> inp = new ArrayList<InpatientTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From InpatientTable Where pid=:p");
        q.setString("p", id);
        inp = q.list();
        inpatient = inp.get(0);
        s.close();
        return inpatient;
    }
    public LabTable findLabTableById(String id) {
        LabTable labt = new LabTable();
        List<LabTable> lab = new ArrayList<LabTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From LabTable Where labno=:p");
        q.setString("p", id);
        lab = q.list();
        labt = lab.get(0);
        s.close();
        return labt;
    }
    public Laboratorist findLaboratoristById(int id) {
        Laboratorist laboratorist = new Laboratorist();
        List<Laboratorist> labor = new ArrayList<Laboratorist>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From Laboratorist Where id=:p");
        q.setInteger("p", id);
        labor = q.list();
        laboratorist = labor.get(0);
        s.close();
        return laboratorist;
    }
    public Login findLoginById(int id) {
        Login login = new Login();
        List<Login> log = new ArrayList<Login>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From Login Where userId=:p");
        q.setInteger("p", id);
        log = q.list();
        login = log.get(0);
        s.close();
        return login;
    }
    public OutpatientTable findOutpatientTableById(String pid) {
        OutpatientTable outpatient = new OutpatientTable();
        List<OutpatientTable> outp = new ArrayList<OutpatientTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From OutpatientTable Where pid=:p");
        q.setString("p", pid);
        outp = q.list();
        outpatient = outp.get(0);
        s.close();
        return outpatient;
    }
    public PatientTable findPatientTableById(String pid) {
        PatientTable patient = new PatientTable();
        List<PatientTable> pat = new ArrayList<PatientTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From PatientTable Where pid=:p");
        q.setString("p", pid);
        pat = q.list();
        patient = pat.get(0);
        s.close();
        return patient;
    }
    public Receptionist findReceptionistById(int recId) {
        Receptionist receptionist = new Receptionist();
        List<Receptionist> recp = new ArrayList<Receptionist>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From Receptionist Where recId=:p");
        q.setInteger("p", recId);
        recp = q.list();
        receptionist = recp.get(0);
        s.close();
        return receptionist;
    }
    public RoomTable findRoomTableById(String roomNo) {
        RoomTable roomTable = new RoomTable();
        List<RoomTable> room = new ArrayList<RoomTable>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From RoomTable Where roomNo=:p");
        q.setString("p", roomNo);
        room = q.list();
        roomTable = room.get(0);
        s.close();
        return roomTable;
    }
    public User findUserById(int id) {
        User user = new User();
        List<User> usr = new ArrayList<User>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From User Where id=:p");
        q.setInteger("p", id);
        usr = q.list();
        user = usr.get(0);
        s.close();
        return user;
    }
    public Pharmasist findPharmasistById(int id) {
        Pharmasist pharmasist = new Pharmasist();
        List<Pharmasist> phar = new ArrayList<Pharmasist>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From Pharmasist Where id=:p");
        q.setInteger("p", id);
        phar = q.list();
        pharmasist = phar.get(0);
        s.close();
        return pharmasist;
    }
    public Nurse findNurseById(String nurseid) {
        Nurse nurse = new Nurse();
        List<Nurse> nrse = new ArrayList<Nurse>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q=s.createQuery("From Student Where id="+id);
        Query q = s.createQuery("From Pharmasist Where id=:p");
        q.setParameter("p", nurseid);
        nrse = q.list();
        nurse = nrse.get(0);
        s.close();
        return nurse;
    }

}

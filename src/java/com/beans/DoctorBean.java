/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.dao.AddValues;
import com.dao.DeleteValues;
import com.dao.SelectById;
import com.dao.SelectIds;
import com.dao.SelectValue;
import com.dao.UpdateValues;
import com.pojo.*;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author use
 */
@ManagedBean
@RequestScoped
public class DoctorBean {

    private DoctorTable doctor = new DoctorTable();
    private EmployeeTable employee = new EmployeeTable();
    private Department department = new Department();
    private User user = new User();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv=new SelectValue();
    DeleteValues dlv=new DeleteValues();
    SelectById sbi = new SelectById();

    public DoctorTable getDoctor() {
        doctor.setAllids(sli.allDoctorIds());
        doctor.setDoctor(slv.getDoctor());
        return doctor;
    }

    public void setDoctor(DoctorTable doctor) {
        this.doctor = doctor;
    }

    public EmployeeTable getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeTable employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String saveDoctor() {
        doctor.setDoctorid(doctor.getDoctorid());
        doctor.setDoctorname(doctor.getDoctorname());
        doctor.setGender(doctor.getGender());
        doctor.setContactNo(doctor.getContactNo());
        doctor.setEmail(doctor.getEmail());
        doctor.setJoiningDate(doctor.getJoiningDate());
        doctor.setPassword(doctor.getPassword());
        doctor.setDepartment_1(doctor.getDepartment_1());

        department.setDeptId(department.getDeptId());
        department.setDeptName(department.getDeptName());
        department.setManagerId(department.getManagerId());
        department.setLocation(department.getLocation());

        employee.setEmployeeId(employee.getEmployeeId());
        employee.setManagerId(employee.getManagerId());
        employee.setDepartmentId(employee.getDepartmentId());
        employee.setDepartmentName(employee.getDepartmentName());
        employee.setPostName(employee.getPostName());
        employee.setEmployeeName(employee.getEmployeeName());
        employee.setEmail(employee.getEmail());
        employee.setPhoneNo(employee.getPhoneNo());
        employee.setHireDate(employee.getHireDate());
        employee.setSalary(employee.getSalary());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());

        doctor.setUser(user);
        doctor.setDepartment(department);
        doctor.setEmployeeTable(employee);

        if (new AddValues().doAddDoctor(doctor)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateDoctor() {
        doctor.setDoctorid(doctor.getDoctorid());
        doctor.setDoctorname(doctor.getDoctorname());
        doctor.setGender(doctor.getGender());
        doctor.setContactNo(doctor.getContactNo());
        doctor.setEmail(doctor.getEmail());
        doctor.setJoiningDate(doctor.getJoiningDate());
        doctor.setPassword(doctor.getPassword());
        doctor.setDepartment_1(doctor.getDepartment_1());

        department.setDeptId(department.getDeptId());
        department.setDeptName(department.getDeptName());
        department.setManagerId(department.getManagerId());
        department.setLocation(department.getLocation());

        employee.setEmployeeId(employee.getEmployeeId());
        employee.setManagerId(employee.getManagerId());
        employee.setDepartmentId(employee.getDepartmentId());
        employee.setDepartmentName(employee.getDepartmentName());
        employee.setPostName(employee.getPostName());
        employee.setEmployeeName(employee.getEmployeeName());
        employee.setEmail(employee.getEmail());
        employee.setPhoneNo(employee.getPhoneNo());
        employee.setHireDate(employee.getHireDate());
        employee.setSalary(employee.getSalary());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());

        doctor.setUser(user);
        doctor.setDepartment(department);
        doctor.setEmployeeTable(employee);

        if (upd.doUpdateDoctorTable(doctor)) {
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteDoctor() {
        doctor.setDoctorid(doctor.getDoctorid());
        doctor.setDoctorname(doctor.getDoctorname());
        doctor.setGender(doctor.getGender());
        doctor.setContactNo(doctor.getContactNo());
        doctor.setEmail(doctor.getEmail());
        doctor.setJoiningDate(doctor.getJoiningDate());
        doctor.setPassword(doctor.getPassword());
        doctor.setDepartment_1(doctor.getDepartment_1());

        department.setDeptId(department.getDeptId());
        department.setDeptName(department.getDeptName());
        department.setManagerId(department.getManagerId());
        department.setLocation(department.getLocation());

        employee.setEmployeeId(employee.getEmployeeId());
        employee.setManagerId(employee.getManagerId());
        employee.setDepartmentId(employee.getDepartmentId());
        employee.setDepartmentName(employee.getDepartmentName());
        employee.setPostName(employee.getPostName());
        employee.setEmployeeName(employee.getEmployeeName());
        employee.setEmail(employee.getEmail());
        employee.setPhoneNo(employee.getPhoneNo());
        employee.setHireDate(employee.getHireDate());
        employee.setSalary(employee.getSalary());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());

        doctor.setUser(user);
        doctor.setDepartment(department);
        doctor.setEmployeeTable(employee);
        dlv.doDeleteDoctorTable(doctor);
        
    }
    public void findDoctorById() {
        doctor=sbi.findDoctorTableById(doctor.getDoctorid());
        doctor.setDoctorid(doctor.getDoctorid());
        doctor.setDoctorname(doctor.getDoctorname());
        doctor.setGender(doctor.getGender());
        doctor.setContactNo(doctor.getContactNo());
        doctor.setEmail(doctor.getEmail());
        doctor.setJoiningDate(doctor.getJoiningDate());
        doctor.setPassword(doctor.getPassword());
        doctor.setDepartment_1(doctor.getDepartment_1());

        department.setDeptId(department.getDeptId());
        department.setDeptName(department.getDeptName());
        department.setManagerId(department.getManagerId());
        department.setLocation(department.getLocation());

        employee.setEmployeeId(employee.getEmployeeId());
        employee.setManagerId(employee.getManagerId());
        employee.setDepartmentId(employee.getDepartmentId());
        employee.setDepartmentName(employee.getDepartmentName());
        employee.setPostName(employee.getPostName());
        employee.setEmployeeName(employee.getEmployeeName());
        employee.setEmail(employee.getEmail());
        employee.setPhoneNo(employee.getPhoneNo());
        employee.setHireDate(employee.getHireDate());
        employee.setSalary(employee.getSalary());
        
        user.setId(user.getId());
        user.setUsertype(user.getUsertype());

        doctor.setUser(user);
        doctor.setDepartment(department);
        doctor.setEmployeeTable(employee);
        
        
    }




    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

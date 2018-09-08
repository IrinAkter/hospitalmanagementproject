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
public class PharmasistBean {

    private Pharmasist pharmasist = new Pharmasist();
    private EmployeeTable employee = new EmployeeTable();
    private Department department = new Department();
    private User user = new User();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv=new SelectValue();
    DeleteValues dlv=new DeleteValues();
    SelectById sbi = new SelectById();

    public Pharmasist getPharmasist() {
        pharmasist.setAllIds(sli.allPharmasistIds());
        pharmasist.setPharmasist(slv.getPharmecy());
        return pharmasist;
    }

    public void setPharmasist(Pharmasist pharmasist) {
        this.pharmasist = pharmasist;
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

    public String savePharmasist() {

        pharmasist.setId(pharmasist.getId());
        pharmasist.setName(pharmasist.getName());
        pharmasist.setEmai(pharmasist.getEmai());
        pharmasist.setContact(pharmasist.getContact());
        pharmasist.setPassword(pharmasist.getPassword());
        pharmasist.setGender(pharmasist.getGender());
        pharmasist.setDob(pharmasist.getDob());
        pharmasist.setEmpid(pharmasist.getEmpid());
        pharmasist.setDeptid(pharmasist.getDeptid());

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
        
        pharmasist.setUser(user);
        pharmasist.setDepartment(department);
        pharmasist.setEmployeeTable(employee);

        if (new AddValues().doSavePharmacist(pharmasist)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updatePharmasist() {

        pharmasist.setId(pharmasist.getId());
        pharmasist.setName(pharmasist.getName());
        pharmasist.setEmai(pharmasist.getEmai());
        pharmasist.setContact(pharmasist.getContact());
        pharmasist.setPassword(pharmasist.getPassword());
        pharmasist.setGender(pharmasist.getGender());
        pharmasist.setDob(pharmasist.getDob());
        pharmasist.setEmpid(pharmasist.getEmpid());
        pharmasist.setDeptid(pharmasist.getDeptid());

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
        
        pharmasist.setUser(user);
        pharmasist.setDepartment(department);
        pharmasist.setEmployeeTable(employee);

        if (upd.doUpdatePharmasist(pharmasist)) {
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deletePharmasist() {

        pharmasist.setId(pharmasist.getId());
        pharmasist.setName(pharmasist.getName());
        pharmasist.setEmai(pharmasist.getEmai());
        pharmasist.setContact(pharmasist.getContact());
        pharmasist.setPassword(pharmasist.getPassword());
        pharmasist.setGender(pharmasist.getGender());
        pharmasist.setDob(pharmasist.getDob());
        pharmasist.setEmpid(pharmasist.getEmpid());
        pharmasist.setDeptid(pharmasist.getDeptid());

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
        
        pharmasist.setUser(user);
        pharmasist.setDepartment(department);
        pharmasist.setEmployeeTable(employee);

        dlv.doDeletePharmasist(pharmasist);
    }
    public void findPharmasistById() {
        pharmasist=sbi.findPharmasistById(pharmasist.getId());
        pharmasist.setId(pharmasist.getId());
        pharmasist.setName(pharmasist.getName());
        pharmasist.setEmai(pharmasist.getEmai());
        pharmasist.setContact(pharmasist.getContact());
        pharmasist.setPassword(pharmasist.getPassword());
        pharmasist.setGender(pharmasist.getGender());
        pharmasist.setDob(pharmasist.getDob());
        pharmasist.setEmpid(pharmasist.getEmpid());
        pharmasist.setDeptid(pharmasist.getDeptid());

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
        
        pharmasist.setUser(user);
        pharmasist.setDepartment(department);
        pharmasist.setEmployeeTable(employee);


    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

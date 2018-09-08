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
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.hibernate.engine.jdbc.BinaryStream;

/**
 *
 * @author use
 */
@ManagedBean
@RequestScoped
public class AccountantBean {

    private Accountant accountant = new Accountant();
    private EmployeeTable employee = new EmployeeTable();
    private Department department = new Department();
    private User user = new User();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv = new SelectValue();
    SelectById sbi = new SelectById();
    DeleteValues dlv=new DeleteValues();
    public Accountant getAccountant() {
        accountant.setAllids(sli.allAccountantIds());
        accountant.setAccountant(slv.getAccountant());
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
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

    public String saveAccountant() {
        accountant.setId(accountant.getId());
        accountant.setName(accountant.getName());
        accountant.setEmail(accountant.getEmail());
        accountant.setContactno(accountant.getContactno());
        accountant.setPassword(accountant.getPassword());
        accountant.setGender(accountant.getGender());
        accountant.setDob(accountant.getDob());

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

        accountant.setDepartment(department);
        accountant.setEmployeeTable(employee);
        accountant.setUser(user);
        if (new AddValues().doSaveAccountant(accountant)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String updateAccountant() {
        accountant.setId(accountant.getId());
        accountant.setName(accountant.getName());
        accountant.setEmail(accountant.getEmail());
        accountant.setContactno(accountant.getContactno());
        accountant.setPassword(accountant.getPassword());
        accountant.setGender(accountant.getGender());
        accountant.setDob(accountant.getDob());

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

        accountant.setDepartment(department);
        accountant.setEmployeeTable(employee);
        accountant.setUser(user);
        if (upd.doUpdateAccountant(accountant)) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }

    }
    public void deleteAccountant() {
        accountant.setId(accountant.getId());
        accountant.setName(accountant.getName());
        accountant.setEmail(accountant.getEmail());
        accountant.setContactno(accountant.getContactno());
        accountant.setPassword(accountant.getPassword());
        accountant.setGender(accountant.getGender());
        accountant.setDob(accountant.getDob());

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

        accountant.setDepartment(department);
        accountant.setEmployeeTable(employee);
        accountant.setUser(user);
        dlv.doDeleteAccountant(accountant);

    }

    public void findAccountantById() {
        accountant = sbi.findAccountantById(accountant.getId());
        accountant.setId(accountant.getId());
        accountant.setName(accountant.getName());
        accountant.setEmail(accountant.getEmail());
        accountant.setContactno(accountant.getContactno());
        accountant.setPassword(accountant.getPassword());
        accountant.setGender(accountant.getGender());
        accountant.setDob(accountant.getDob());

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

        accountant.setDepartment(department);
        accountant.setEmployeeTable(employee);
        accountant.setUser(user);

    }

}

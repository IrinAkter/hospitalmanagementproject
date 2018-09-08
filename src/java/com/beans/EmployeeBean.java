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
public class EmployeeBean {

    private EmployeeTable employee = new EmployeeTable();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv=new SelectValue();
    DeleteValues dlv=new DeleteValues();
    SelectById sbi = new SelectById();

    public EmployeeTable getEmployee() {
        employee.setAllids(sli.allEmployeeIds());
        employee.setEmployee(slv.getEmployee());
        return employee;
    }

    public void setEmployee(EmployeeTable employee) {
        this.employee = employee;
    }

    public String saveEmployee() {
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
        if (new AddValues().doSaveEmployee(employee)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateEmployee() {
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
        if (upd.doUpdateEmployeeTable(employee)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteEmployee() {
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
        dlv.doDeleteEmployeeTable(employee);
        
    }
    public void findEmployeeById() {
        employee=sbi.findEmployeeTableById(employee.getEmployeeId());
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
       
    }
}

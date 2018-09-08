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
public class ReceptionistBean {

    private Receptionist receptionist = new Receptionist();
    private EmployeeTable employee = new EmployeeTable();
    private Department department = new Department();
    private User user = new User();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv=new SelectValue();
    DeleteValues dlv=new DeleteValues();
    SelectById sbi = new SelectById();

    public Receptionist getReceptionist() {
        receptionist.setReceptionist(slv.getRecep());
        receptionist.setAllIds(sli.allReceptionistIds());
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
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

    public String saveReceptionist() {

        receptionist.setRecId(receptionist.getRecId());
        receptionist.setRecName(receptionist.getRecName());
        receptionist.setGender(receptionist.getGender());
        receptionist.setDob(receptionist.getDob());
        receptionist.setRecEmail(receptionist.getRecEmail());
        receptionist.setRecPassword(receptionist.getRecPassword());
        receptionist.setRecContactno(receptionist.getRecContactno());
        
        
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
        
        receptionist.setUser(user);
        receptionist.setDepartment(department);
        receptionist.setEmployeeTable(employee);

        if (new AddValues().doSaveReceptionist(receptionist)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateReceptionist() {

        receptionist.setRecId(receptionist.getRecId());
        receptionist.setRecName(receptionist.getRecName());
        receptionist.setGender(receptionist.getGender());
        receptionist.setDob(receptionist.getDob());
        receptionist.setRecEmail(receptionist.getRecEmail());
        receptionist.setRecPassword(receptionist.getRecPassword());
        receptionist.setRecContactno(receptionist.getRecContactno());
        
        
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
        
        receptionist.setUser(user);
        receptionist.setDepartment(department);
        receptionist.setEmployeeTable(employee);

        if (new AddValues().doSaveReceptionist(receptionist)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public void findReceptionistById() {

        receptionist.setRecId(receptionist.getRecId());
        receptionist.setRecName(receptionist.getRecName());
        receptionist.setGender(receptionist.getGender());
        receptionist.setDob(receptionist.getDob());
        receptionist.setRecEmail(receptionist.getRecEmail());
        receptionist.setRecPassword(receptionist.getRecPassword());
        receptionist.setRecContactno(receptionist.getRecContactno());
        
        
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
        
        receptionist.setUser(user);
        receptionist.setDepartment(department);
        receptionist.setEmployeeTable(employee);

        
    }
    public void deleteReceptionist() {
        receptionist.setRecId(receptionist.getRecId());
        receptionist.setRecName(receptionist.getRecName());
        receptionist.setGender(receptionist.getGender());
        receptionist.setDob(receptionist.getDob());
        receptionist.setRecEmail(receptionist.getRecEmail());
        receptionist.setRecPassword(receptionist.getRecPassword());
        receptionist.setRecContactno(receptionist.getRecContactno());
        
        
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
        
        receptionist.setUser(user);
        receptionist.setDepartment(department);
        receptionist.setEmployeeTable(employee);
        dlv.doDeleteReceptionist(receptionist);
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

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
import com.pojo.Department;
import com.pojo.EmployeeTable;
import com.pojo.Nurse;
import com.pojo.User;
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
public class NurseBean {

    private Nurse nurse = new Nurse();
    private EmployeeTable employee = new EmployeeTable();
    private Department department = new Department();
    private User user = new User();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv = new SelectValue();
    SelectById sbi = new SelectById();
    DeleteValues dlv=new DeleteValues();

    public Nurse getNurse() {
        nurse.setAllids(sli.allNurseIds());
        nurse.setNurse(slv.getNurse());
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String saveNurse() {
        
        
        nurse.setNurseid(nurse.getNurseid());
        nurse.setNursename(nurse.getNursename());
        nurse.setEmail(nurse.getEmail());
        nurse.setPassword(nurse.getPassword());
        
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
        
        nurse.setEmployeeTable(employee);
        nurse.setDepartment(department);
        nurse.setUser(user);
        
        
        if (new AddValues().doSaveNurse(nurse)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateNurse() {
        
        
        nurse.setNurseid(nurse.getNurseid());
        nurse.setNursename(nurse.getNursename());
        nurse.setEmail(nurse.getEmail());
        nurse.setPassword(nurse.getPassword());
        
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
        
        nurse.setEmployeeTable(employee);
        nurse.setDepartment(department);
        nurse.setUser(user);
        
        
        if (upd.doUpdateNurse(nurse)) {
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteNurse() {
        
        
        nurse.setNurseid(nurse.getNurseid());
        nurse.setNursename(nurse.getNursename());
        nurse.setEmail(nurse.getEmail());
        nurse.setPassword(nurse.getPassword());
        
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
        
        nurse.setEmployeeTable(employee);
        nurse.setDepartment(department);
        nurse.setUser(user);
        
        
        dlv.doDeleteNurse(nurse);
    }
    public void findNurseById() {
        nurse=sbi.findNurseById(nurse.getNurseid());
        
        nurse.setNurseid(nurse.getNurseid());
        nurse.setNursename(nurse.getNursename());
        nurse.setEmail(nurse.getEmail());
        nurse.setPassword(nurse.getPassword());
        
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
        
        nurse.setEmployeeTable(employee);
        nurse.setDepartment(department);
        nurse.setUser(user);
        
    }

}

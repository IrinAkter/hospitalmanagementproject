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
public class DepartmentBean {

    private Department department = new Department();
    SelectValue sv = new SelectValue();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv = new SelectValue();
    SelectById sbi = new SelectById();
    DeleteValues dlv = new DeleteValues();

    public Department getDepartment() {
        department.setAllids(sli.allDepartmentIds());
        department.setAllDept(sv.getDepartmentName());
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String saveDepartment() {
        department.setDeptId(department.getDeptId());
        department.setDeptName(department.getDeptName());
        department.setManagerId(department.getManagerId());
        department.setLocation(department.getLocation());
        department.setDoctorTables(department.getDoctorTables());
        department.setReceptionists(department.getReceptionists());
        if (new AddValues().doDepartment(department)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateDepartment() {
        department.setDeptId(department.getDeptId());
        department.setDeptName(department.getDeptName());
        department.setManagerId(department.getManagerId());
        department.setLocation(department.getLocation());
        department.setDoctorTables(department.getDoctorTables());
        department.setReceptionists(department.getReceptionists());
        if (upd.doUpdateDepartment(department)) {
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteDepartment() {
        department.setDeptId(department.getDeptId());
        department.setDeptName(department.getDeptName());
        department.setManagerId(department.getManagerId());
        department.setLocation(department.getLocation());
        department.setDoctorTables(department.getDoctorTables());
        department.setReceptionists(department.getReceptionists());
        dlv.doDeleteDepartment(department);
    }
    public void findDepartmentById() {
        department = sbi.findDepartmentById(department.getDeptId());
        department.setDeptId(department.getDeptId());
        department.setDeptName(department.getDeptName());
        department.setManagerId(department.getManagerId());
        department.setLocation(department.getLocation());
        department.setDoctorTables(department.getDoctorTables());
        department.setReceptionists(department.getReceptionists());

    }
}

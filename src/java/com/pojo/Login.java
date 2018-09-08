package com.pojo;
// Generated Aug 2, 2016 7:42:26 PM by Hibernate Tools 4.3.1

import com.dao.CheckLogin;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Login generated by hbm2java
 */
@ManagedBean
@SessionScoped
public class Login implements java.io.Serializable {

    private int userId;
    private User user;
    private String userName;
    private String password;
    private String usertype;
    private List<Integer> allids=new ArrayList<>();
     private List<Login> login=new ArrayList<Login>();

    public Login() {
    }

    public Login(int userId) {
        this.userId = userId;
    }

    public Login(int userId, User user, String userName, String password) {
        this.userId = userId;
        this.user = user;
        this.userName = userName;
        this.password = password;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String userLogin() {
        CheckLogin dao = new CheckLogin();
        if (usertype.matches("Accountant")) {
            if (dao.checkLoginAccountant(userName, password)) {
                return "AccountantAccess";
              
            } else {
                return "LoginForm";
            }
        }
        else if (usertype.equalsIgnoreCase("Admin")) {

            if (dao.checkLoginAdmin(userName, password)) {
                return "AdminAccess";
            } else {
                return "LoginForm";
            }
        }
        else if (usertype.equalsIgnoreCase("Doctor")) {

            if (dao.checkDoctor(userName, password)) {
                return "DoctorAccess";
            } else {
                return "LoginForm";
            }
        }
        else if (usertype.equalsIgnoreCase("Patient")) {

            if (dao.checkPatient(userName, password)) {
                return "Patient";
            } else {
                return "LoginForm";
            }
        }
        else if (usertype.equalsIgnoreCase("Nurse")) {

            if (dao.checkNurse(userName, password)) {
                return "NurseAccess";
            } else {
                return "LoginForm";
            }
        }
        else if (usertype.equalsIgnoreCase("Receptionist")) {

            if (dao.checkReceptionist(userName, password)) {
                return "ReceptionistAccess";
            } else {
                return "LoginForm";
            }
        }
        else if (usertype.equalsIgnoreCase("Pharmacist")) {

            if (dao.checkPharmacist(userName, password)) {
                return "PharmasistAccess";
            } else {
                return "LoginForm";
            }
        }
        else if (usertype.equalsIgnoreCase("Laboratorist")) {

            if (dao.checkLaboratorist(userName, password)) {
                return "LaboratoristAccess";
            } else {
                return "LoginForm";
            }
        }
        return "LoginForm";
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public List<Integer> getAllids() {
        return allids;
    }

    public void setAllids(List<Integer> allids) {
        this.allids = allids;
    }

    public List<Login> getLogin() {
        return login;
    }

    public void setLogin(List<Login> login) {
        this.login = login;
    }

}
package com.pojo;
// Generated Aug 2, 2016 7:42:26 PM by Hibernate Tools 4.3.1

import com.dao.AddValues;
import com.dao.ConnectDb;
import com.dao.SelectById;
import com.dao.SelectIds;
import com.dao.SelectValue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * BillRoom generated by hbm2java
 */
@ManagedBean
@SessionScoped
public class BillRoom implements java.io.Serializable {

    private String pid;
    private String pname;
    private String psex;
    private String bloodg;
    private String disease;
    private String doctorid;
    private String custDate;
    private String d2;
    private String d3;
    private String doctorname;

    private String roomNo;
    private double advance;
    private String admitId;

    private Integer billNo;
    private int dischargeId;
    private String billingDate;
    private Double roomCharges;
    private Double serviceCharges=0.0;
    private Double chargesPaid;
    private Double dueCharges;
    private double totalCharges;
    private Integer noOfDays=0;
    private Double totalRoomCharges;

    private String dateOfAdmission;
    private String dateOfDischarge;

    private OutpatientTable outpatient = new OutpatientTable();
    private SelectIds si = new SelectIds();
    private SelectById sbi = new SelectById();
    private SelectValue slv = new SelectValue();
    private PatientTable patient = new PatientTable();
    private InpatientTable inpatient = new InpatientTable();
    private List<String> idList = new ArrayList<String>();
    private List<BillRoom> billr = new ArrayList<BillRoom>();

    public BillRoom() {
    }

    public BillRoom(int dischargeId, String billingDate, double totalCharges) {
        this.dischargeId = dischargeId;
        this.billingDate = billingDate;
        this.totalCharges = totalCharges;
    }

    public BillRoom(int dischargeId, String billingDate, Double roomCharges, Double serviceCharges, Double chargesPaid, Double dueCharges, double totalCharges, Integer noOfDays, Double totalRoomCharges) {
        this.dischargeId = dischargeId;
        this.billingDate = billingDate;
        this.roomCharges = roomCharges;
        this.serviceCharges = serviceCharges;
        this.chargesPaid = chargesPaid;
        this.dueCharges = dueCharges;
        this.totalCharges = totalCharges;
        this.noOfDays = noOfDays;
        this.totalRoomCharges = totalRoomCharges;
    }

    public Integer getBillNo() {
        return this.billNo;
    }

    public void setBillNo(Integer billNo) {
        this.billNo = billNo;
    }

    public int getDischargeId() {
        return this.dischargeId;
    }

    public void setDischargeId(int dischargeId) {
        this.dischargeId = dischargeId;
    }

    public String getBillingDate() {
        return this.billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }

    public Double getRoomCharges() {
        return this.roomCharges;
    }

    public void setRoomCharges(Double roomCharges) {
        this.roomCharges = roomCharges;
    }

    public Double getServiceCharges() {
        return this.serviceCharges;
    }

    public void setServiceCharges(Double serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public Double getChargesPaid() {
        return this.chargesPaid;
    }

    public void setChargesPaid(Double chargesPaid) {
        this.chargesPaid = chargesPaid;
    }

    public Double getDueCharges() {
        return this.dueCharges;
    }

    public void setDueCharges(Double dueCharges) {
        this.dueCharges = dueCharges;
    }

    public double getTotalCharges() {
        return this.totalCharges;
    }

    public void setTotalCharges(double totalCharges) {
        this.totalCharges = totalCharges;
    }

    public Integer getNoOfDays() {
        return this.noOfDays;
    }

    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }

    public Double getTotalRoomCharges() {
        return this.totalRoomCharges;
    }

    public void setTotalRoomCharges(Double totalRoomCharges) {
        this.totalRoomCharges = totalRoomCharges;
    }

    public List<String> getIdList() {
        idList = si.allPatientIds();
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public List<BillRoom> getBillr() {
        billr = slv.getBill();
        return billr;
    }

    public void setBillr(List<BillRoom> billr) {
        this.billr = billr;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex;
    }

    public String getBloodg() {
        return bloodg;
    }

    public void setBloodg(String bloodg) {
        this.bloodg = bloodg;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public String getAdmitId() {
        return admitId;
    }

    public void setAdmitId(String admitId) {
        this.admitId = admitId;
    }

    

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public void itemStateChanged() {
        try {
            Connection con = new ConnectDb().connectDB();
            PreparedStatement pstmt = con.prepareStatement("Select* from patient_table where pid=?");
            pstmt.setString(1, getPid());
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                pname = rs.getString(2);
                psex = rs.getString(3);
                disease = rs.getString(9);
                doctorid = rs.getString(10);
                bloodg = rs.getString(5);

            }
            PreparedStatement pstmt1 = con.prepareStatement("Select* from doctor_table where doctorid=(Select doctorid from patient_table where pid=?)");
            pstmt1.setString(1, getPid());
            ResultSet rs1 = pstmt1.executeQuery();
            while (rs1.next()) {
                doctorname = rs1.getString(2);
            }
            PreparedStatement pstmt2 = con.prepareStatement("Select* from inpatient_table where pid=?");
            pstmt2.setString(1, getPid());
            ResultSet rs2 = pstmt2.executeQuery();
            while (rs2.next()) {
                roomNo = rs2.getString(2);
                dateOfAdmission = rs2.getString(3);
            }
            PreparedStatement pstmt3 = con.prepareStatement("Select* from outpatient_table where pid=?");
            pstmt3.setString(1, getPid());
            ResultSet rs3 = pstmt3.executeQuery();
            while (rs3.next()) {
                dateOfDischarge = rs3.getString(3);
                dischargeId = rs3.getInt(5);
            }
            PreparedStatement pstmt4 = con.prepareStatement("Select* from room_table where room_no=(Select room_no from inpatient_table where pid=?)");
            pstmt4.setString(1, getPid());
            ResultSet rs4 = pstmt4.executeQuery();
            while (rs4.next()) {
                roomCharges = rs4.getDouble(4);
            }
            PreparedStatement pstmt5 = con.prepareStatement("Select service_charge from lab_table where pid=?");
            pstmt5.setString(1, getPid());
            ResultSet rs5 = pstmt5.executeQuery();
            while (rs5.next()) {
                serviceCharges=serviceCharges+rs5.getDouble("service_charge");
            }
            PreparedStatement pstmt6 = con.prepareStatement("Select* from outpatient_table");
            ResultSet rs6 = pstmt.executeQuery();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void noofDaysEvent() {
        double add1 = roomCharges;
        double add = noOfDays;
        double add4 = serviceCharges;
        double add2 = add1 * add;
        setTotalRoomCharges(add2);
        double add5 = add2 + add4;
        setTotalCharges(add5);
    }
//    public void noOfD(){
////            Date d = dateOfDischarge;
////            Date d2=dateOfAdmission;
////        Date d1=new Date("01/02/1990");
////        Date d2=new Date();
//            Long l=dateOfDischarge.getTime()-dateOfAdmission.getTime();
//            int day=(int)((l/(24*60*60*1000)));
////            Long l=dateOfDischarge.getTime()-dateOfAdmission.getTime();
////            int day=(int)((l/(24*60*60*1000)));
////        Date d1=new Date(custDate);
//            setD2(String.valueOf(dateOfDischarge));
//    }
    public void totalPaid() {                                         
        double add1 = totalCharges;
        double add = chargesPaid;
        double add2 = add1 - add;
        setDueCharges(add2);
    } 

   

    public OutpatientTable getOutpatient() {
        return outpatient;
    }

    public void setOutpatient(OutpatientTable outpatient) {
        this.outpatient = outpatient;
    }

    public SelectIds getSi() {
        return si;
    }

    public void setSi(SelectIds si) {
        this.si = si;
    }

    public SelectById getSbi() {
        return sbi;
    }

    public void setSbi(SelectById sbi) {
        this.sbi = sbi;
    }

    public SelectValue getSlv() {
        return slv;
    }

    public void setSlv(SelectValue slv) {
        this.slv = slv;
    }

    public PatientTable getPatient() {
        return patient;
    }

    public void setPatient(PatientTable patient) {
        this.patient = patient;
    }

    public InpatientTable getInpatient() {
        return inpatient;
    }

    public void setInpatient(InpatientTable inpatient) {
        this.inpatient = inpatient;
    }

  

    public String getCustDate() {
        return custDate;
    }

    public void setCustDate(String custDate) {
        this.custDate = custDate;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }
    public void dosave(){
    BillRoom bill=new BillRoom();
    if(new AddValues().doAddBill(dischargeId, billingDate, roomCharges, serviceCharges, chargesPaid, dueCharges, totalCharges, noOfDays, totalRoomCharges)){
        
    }
            
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(String dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }
    
}
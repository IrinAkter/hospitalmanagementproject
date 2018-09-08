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
public class RoomBean {

    private RoomTable room = new RoomTable();
    SelectIds sli = new SelectIds();
    UpdateValues upd = new UpdateValues();
    SelectValue slv = new SelectValue();
    DeleteValues dlv = new DeleteValues();
    SelectById sbi = new SelectById();
    
    public RoomTable getRoom() {
        room.setAllIds(sli.allRoomIds());
        room.setRoomTable(slv.getRoom());
        return room;
    }
    
    public void setRoom(RoomTable room) {
        this.room = room;
    }
    
    public String saveRoomTable() {
        
        room.setRoomNo(room.getRoomNo());
        room.setRoomType(room.getRoomType());
        room.setStatus(room.getStatus());
        room.setRoomCharge(room.getRoomCharge());
        
        if (new AddValues().doSaveRoom(room)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration Successful"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration failed"));
            return "error";
        }
    }
    public String updateRoomTable() {
        
        room.setRoomNo(room.getRoomNo());
        room.setRoomType(room.getRoomType());
        room.setStatus(room.getStatus());
        room.setRoomCharge(room.getRoomCharge());
        
        if (upd.doUpdateRoom(room)) {
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successfully Updated"));
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Failed To Update"));
            return "error";
        }
    }
    public void deleteRoomTable() {
        
        room.setRoomNo(room.getRoomNo());
        room.setRoomType(room.getRoomType());
        room.setStatus(room.getStatus());
        room.setRoomCharge(room.getRoomCharge());
        dlv.doDeleteRoom(room);
        
    }
    public void findRoomTableById() {
        room=sbi.findRoomTableById(room.getRoomNo());
        room.setRoomNo(room.getRoomNo());
        room.setRoomType(room.getRoomType());
        room.setStatus(room.getStatus());
        room.setRoomCharge(room.getRoomCharge());
        
        
    }
}

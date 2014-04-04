/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author adamv_000
 */
public class ElectiveDTO implements Serializable {

    private Integer electiveID;
    private String title;
    private String description;
    private Date date;
    private String proposed;
    private TeacherDTO teacher;
    public ElectiveDTO() {
    }
// for when Object is in the DB
    public ElectiveDTO(int electiveID, String title, String description, Date date, String proposed ,TeacherDTO teacher) {
        this.electiveID = electiveID;
        this.title = title;
        this.description = description;
        this.date = date;
        this.proposed = proposed;
    }
// for when Object is not in the DB
    public ElectiveDTO(String title, String description, Date date, String proposed,TeacherDTO teacher) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.proposed = proposed;
    }

    public ElectiveDTO(int electiveID, String title, String description, String proposed) {
        this.electiveID = electiveID;
        this.title = title;
        this.description = description;
        this.proposed = proposed;
    }

    public ElectiveDTO(String title, String description, Date date,TeacherDTO teacher) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public int getElectiveID() {
        return electiveID;
    }
     public int getElectiveId() {
        return electiveID;
    }

    public TeacherDTO getTeacher() {
        return teacher;
    }

    public Date getDate() {
        return date;
    }

    public String getDetails() {
        return description;
    }

    public void setDetails(String Details) {
        this.description = Details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = Title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProposed() {
        return proposed;
    }

    public void setProposed(String proposed) {
        this.proposed = proposed;
    }

    public void setElectiveID(Integer electiveID) {
        this.electiveID = electiveID;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ElectiveDTO{" + "title=" + title + ", description=" + description + ", date=" + date + '}';
    }

}

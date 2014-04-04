/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Stefan
 */
public class ElectiveFullListDTO {
  private int electiveID;
    private String title;
    private String description;
    private Date date;
    private String proposed;
    private TeacherDTO teacher;
    Collection<StudentDTO> stdentList;

    public ElectiveFullListDTO(int electiveID, String title, String description, Date date, String proposed, TeacherDTO teacher, Collection<StudentDTO> stdentList) {
        this.electiveID = electiveID;
        this.title = title;
        this.description = description;
        this.date = date;
        this.proposed = proposed;
        this.teacher = teacher;
        this.stdentList = stdentList;
    }

    public int getElectiveID() {
        return electiveID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public String getProposed() {
        return proposed;
    }

    public TeacherDTO getTeacher() {
        return teacher;
    }

    public Collection<StudentDTO> getStdentList() {
        return stdentList;
    }
    
}

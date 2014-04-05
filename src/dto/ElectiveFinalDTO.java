/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author adamv_000
 */
public class ElectiveFinalDTO extends ElectiveDTO {

    private String pool;
    private TeacherDTO teacher;

    public ElectiveFinalDTO(Integer electiveId, String Title, String Details, Date year, String proposed, String pool, TeacherDTO teacher) {
        super(electiveId, Title, Details, year, proposed, teacher);
        this.pool = pool;
        this.teacher = teacher;

    }

    public String getPool() {
        return pool;
    }

}

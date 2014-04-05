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
public class ElectiveSecondDTO extends ElectiveDTO {

    private String pool;

    public ElectiveSecondDTO(Integer electiveId, String Title, String Details, Date year, String proposed, String pool, TeacherDTO teacher) {
        super(electiveId, Title, Details, year, proposed, teacher);
        this.pool = pool;

    }

    public ElectiveSecondDTO(Integer electiveID, String title, String description, Date date, String proposed, String pool) {
        super(electiveID, title, description, date, proposed);
        this.pool = pool;
    }

    public String getPool() {
        return pool;
    }

}

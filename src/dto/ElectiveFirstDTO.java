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
public class ElectiveFirstDTO extends ElectiveDTO {

    private int countFirstpriority;
    private int countSecondPriority;

    public ElectiveFirstDTO(int electiveId, String Title, String Details, Date year, String proposed, int countFirstPriority, int countSecondPriority, TeacherDTO teacher) {
        super(electiveId, Title, Details, year, proposed, teacher);
        this.countFirstpriority = countFirstPriority;
        this.countSecondPriority = countSecondPriority;
    }

    public ElectiveFirstDTO(int electiveID, String title, String description, String proposed) {
        super(electiveID, title, description, proposed);
    }

    public ElectiveFirstDTO(Integer electiveID, String title, String description, Date date, String proposed, int countFirstpriority, int countSecondPriority) {
        super(electiveID, title, description, date, proposed);
        this.countFirstpriority = countFirstpriority;
        this.countSecondPriority = countSecondPriority;
    }

    public int getCountFirstpriority() {
        return countFirstpriority;
    }

    public int getCountSecondPriority() {
        return countSecondPriority;
    }

}

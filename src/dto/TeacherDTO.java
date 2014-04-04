/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

import java.util.Collection;

/**
 *
 * @author Stefan
 */
public class TeacherDTO {
 private String CPR;
 private String firstName;
 private String lastName;
 private Collection<SkillDTO> skills;

    public String getCPR() {
        return CPR;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Collection<SkillDTO> getSkills() {
        return skills;
    }

    public TeacherDTO(String CPR, String firstName, String lastName, Collection<SkillDTO> skills) {
        this.CPR = CPR;
        this.firstName = firstName;
        this.lastName = lastName;
        this.skills = skills;
    }
    
}

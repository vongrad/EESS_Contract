/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author Stefan
 */
public class StudentWithElectivesDTO implements Serializable {

    private String firstName;
    private String lastName;
    private String cpr;
    private ElectiveSecondDTO primaryElective;
    private ElectiveSecondDTO secondaryElective;

    public StudentWithElectivesDTO(String firstName, String lastName, String cpr, ElectiveSecondDTO primaryElective, ElectiveSecondDTO secondaryElective) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpr = cpr;
        this.primaryElective = primaryElective;
        this.secondaryElective = secondaryElective;
    }


    public ElectiveSecondDTO getPrimaryElective() {
        return primaryElective;
    }

    public ElectiveSecondDTO getSecondaryElective() {
        return secondaryElective;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCpr() {
        return cpr;
    }

}

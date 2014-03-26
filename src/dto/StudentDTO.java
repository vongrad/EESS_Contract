package dto;

import java.io.Serializable;

/**
 *
 * @author Stefan
 */
public class StudentDTO implements Serializable {

    private String firstName;
    private String lastName;
    private String cpr;

    public StudentDTO(String firstName, String lastName, String cpr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpr = cpr;
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

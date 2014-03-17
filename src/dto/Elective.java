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
public class Elective implements Serializable {

    private String name;
    private String description;
    private int voteCountPriority1;
    private int voteCountPriority2;

    public Elective(String name, String description, int voteCountPriority1, int voteCountPriority2) {
        this.name = name;
        this.description = description;
        this.voteCountPriority1 = voteCountPriority1;
        this.voteCountPriority2 = voteCountPriority2;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getVoteCountPriority1() {
        return voteCountPriority1;
    }

    public int getVoteCountPriority2() {
        return voteCountPriority2;
    }

}

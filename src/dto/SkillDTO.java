/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Stefan
 */
public class SkillDTO {

    private int skillId;
    private String skillName;

    public int getSkillId() {
        return skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public SkillDTO(int skillId, String skillName) {
        this.skillId = skillId;
        this.skillName = skillName;
    }

}

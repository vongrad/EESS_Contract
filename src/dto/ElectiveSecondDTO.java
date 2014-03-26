package dto;

import java.util.Date;

/**
 *
 * @author adamv_000
 */
public class ElectiveSecondDTO extends ElectiveDTO {

    private String pool;

    public ElectiveSecondDTO(String Title, String Details, Date year, String pool) {
        super(Title, Details, year);
        this.pool = pool;
    }

    public String getPool() {
        return pool;
    }

}

package mk.ukim.finki.drivingschoolevidencesystem.domain.dto;

import lombok.Data;

@Data
public class CategoryDTO {
    private long id;
    private String name;
    private int price;

    public CategoryDTO() {

    }
}

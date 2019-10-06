package mk.ukim.finki.drivingschoolevidencesystem.domain.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class InstructorCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User instructor;

    public InstructorCategory() {

    }
}

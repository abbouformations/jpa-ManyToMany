package ma.formations.jpa.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Activite {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique=true)
    private String description;
    @ManyToMany(mappedBy = "activites")
    private List<Personne> personnes = new ArrayList<>();

    @Override
    public String toString() {
        return "Activite{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}

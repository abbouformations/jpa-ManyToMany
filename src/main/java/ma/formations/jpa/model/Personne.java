package ma.formations.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Personne {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    @ManyToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Activite> activites=new ArrayList<>();
}

package ma.cigma.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Activite implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	@Column(unique=true)
	private String description;

	public Activite(String description) {
		super();
		this.description = description;
	}

	@ManyToMany(mappedBy = "activites")
	private List<Personne> personnes = new ArrayList<>();

}

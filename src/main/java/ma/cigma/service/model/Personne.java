package ma.cigma.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Personne implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PERSONNE_ACTIVITE",joinColumns=@JoinColumn(name="PERSONNE_ID"),inverseJoinColumns=@JoinColumn(name="ACTIVITE_ID"))
	private List<Activite> activites=new ArrayList<>();
	
	public void addActivite(Activite a) {
		activites.add(a);
	}

	public Personne(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

}

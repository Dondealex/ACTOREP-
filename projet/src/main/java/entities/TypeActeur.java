package entities;

import java.util.Collection;

import javax.persistence.*;


@Entity
public class TypeActeur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private String description;
	
	private Collection<Compte> comptes;

}

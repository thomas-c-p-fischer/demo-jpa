/** Package contenant les entités */
package fr.diginamic.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** Entité Région */
@Entity
@Table(name="region")
public class Region {
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** nom */
	@Column(name = "NOM", length = 30, nullable = false, unique = true)
	private String nom;
	
	/**	Constructeur sans arguments */
	public Region() {	
	}
	
	/** Constructeur
	 * @param id
	 * @param nom
	 */
	public Region(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", nom=" + nom + "]";
	}

	/** Getter
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}	
}
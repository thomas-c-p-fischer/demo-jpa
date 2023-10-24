/** package où se trouve ConnexionJpa */
package fr.diginamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.entities.Region;

/** Classe éxecutable pour la connexion jpa */
public class ConnexionJpa {

	/**	Méthode main où l'on éxecute le code
	 * @param args
	 * @author thomas.fischer
	 */
	public static void main(String[] args) {

		EntityManagerFactory eMf = Persistence.createEntityManagerFactory("recensement_jpa");
		EntityManager em = eMf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Region region = em.find(Region.class, 119);
		if(!(region == null)) {
			System.out.println(region);
		}
		
		Region regionAjoutee = new Region();
		regionAjoutee.setNom("Bourgogne-Franche-Comté");
		em.persist(regionAjoutee);
		
		transaction.commit();
	}
}
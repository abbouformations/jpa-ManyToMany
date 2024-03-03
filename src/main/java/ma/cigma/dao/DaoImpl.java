package ma.cigma.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import ma.cigma.service.model.Activite;

public class DaoImpl implements IDao {
	private EntityManager session;
	private static final Logger log = Logger.getLogger("DaoImpl");

	@Override
	public <T> void save(T t) {
		try {
			session = SessionBuilder.getSessionfactory().createEntityManager();
//			session.setFlushMode(FlushModeType.AUTO);
			EntityTransaction tx = session.getTransaction();
			tx.begin();
			/*
			 * merge : pour insérer ou modifier. persist : pour insérer.
			 * 
			 * session.persist vs session.merge : - persist permet d'ajouter un
			 * objet et son résultat est void. - merge permet de fusionner
			 * l'objet en paramètre avec celui au niveau de la base de données
			 * et attacher l'objet résultat à la session.
			 */
			session.merge(t);
			tx.commit();
			log.info(t.getClass().getName() + " ajouté avec succés");
		} catch (Exception e) {
			e.printStackTrace();
			log.error("erreur dans save()", e);

		} finally {
			session.close();
		}
	}

	@Override
	public Activite getActiviteBydescription(String description) {
		try {
			Activite result = null;
			session = SessionBuilder.getSessionfactory().createEntityManager();
			Query q=session.createQuery("select a from Activite a where a.description like :description");
			q.setParameter("description", description);
			result=(Activite)q.getSingleResult();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			log.error("erreur dans save()", e);
			return null;
		} finally {
			session.close();
		}
	}

}

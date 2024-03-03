package ma.cigma;

import ma.cigma.dao.DaoImpl;
import ma.cigma.dao.IDao;
import ma.cigma.service.model.Activite;
import ma.cigma.service.model.Personne;

public class Test {
	static IDao dao = new DaoImpl();

	public static void main(String[] args) {
		IDao dao = new DaoImpl();
		Activite a1 = new Activite("ACTIVITE_1");
		Activite a2 = new Activite("ACTIVITE_2");
		Activite a3 = new Activite("ACTIVITE_3");
		Activite a4 = new Activite("ACTIVITE_4");
		Activite a5 = new Activite("ACTIVITE_5");

		Personne p1 = new Personne("firstname_personne_1", "lastname_personne_1");
		Personne p2 = new Personne("firstname_personne_2", "lastname_personne_2");
		Personne p3 = new Personne("firstname_personne_3", "lastname_personne_3");

		p1.addActivite(a1);
		p1.addActivite(a2);
		dao.save(p1);
		a1 = dao.getActiviteBydescription("ACTIVITE_1");
		a2 = dao.getActiviteBydescription("ACTIVITE_2");

		p2.addActivite(a1);
		p2.addActivite(a3);
		p2.addActivite(a4);
		dao.save(p2);
		
		a3 = dao.getActiviteBydescription("ACTIVITE_3");
		a4 = dao.getActiviteBydescription("ACTIVITE_4");

		p3.addActivite(a5);
		dao.save(p3);
	}
}

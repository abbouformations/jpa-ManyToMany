package ma.formations.jpa;

import ma.formations.jpa.dao.DaoImpl;
import ma.formations.jpa.dao.IDao;
import ma.formations.jpa.model.Personne;

import java.util.List;

/**
 * Chercher la liste des personnes ayant une description donnée
 */
public class Test2 {
    static IDao dao = new DaoImpl();

    public static void main(String[] args) {
        final String description="ACTIVITE_1";
        IDao dao = new DaoImpl();
        List<Personne> personnesFound = dao.getPersonnesByActivite(description);
        personnesFound.forEach(System.out::println);
    }
}

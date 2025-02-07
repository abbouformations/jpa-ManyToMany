package ma.formations.jpa;

import ma.formations.jpa.dao.DaoImpl;
import ma.formations.jpa.dao.IDao;

/**
 * Supprimer les personnes par leurs noms et prénoms
 */
public class Test3 {
    static IDao dao = new DaoImpl();

    public static void main(String[] args) {
        final String firstname="firstname_personne_1";
        final String lastname="lastname_personne_1";
        IDao dao = new DaoImpl();
        dao.remove(firstname,lastname);
        System.out.println("Personne supprimé avec succés");
    }
}

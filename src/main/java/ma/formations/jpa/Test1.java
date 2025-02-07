package ma.formations.jpa;

import ma.formations.jpa.dao.DaoImpl;
import ma.formations.jpa.dao.IDao;
import ma.formations.jpa.model.Activite;
import ma.formations.jpa.model.Personne;

import java.util.List;

/**
 * Créer des articles avec leurs catégories
 */
public class Test1 {
    static IDao dao = new DaoImpl();

    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        Activite a1 = Activite.builder().description("ACTIVITE_1").build();
        Activite a2 = Activite.builder().description("ACTIVITE_2").build();
        Activite a3 = Activite.builder().description("ACTIVITE_3").build();
        Activite a4 = Activite.builder().description("ACTIVITE_4").build();
        Activite a5 = Activite.builder().description("ACTIVITE_5").build();

        Personne p1 = Personne.builder().
                firstname("firstname_personne_1").
                lastname("lastname_personne_1").
                activites(List.of(a1,a2)).
                build();
        dao.save(p1);

        Personne p2 = Personne.builder().
                firstname("firstname_personne_2").
                lastname("lastname_personne_2").
                activites(List.of(a3,a4)).
                build();
        dao.save(p2);

        Personne p3 = Personne.builder().
                firstname("firstname_personne_3").
                lastname("lastname_personne_3").
                activites(List.of(a5)).
                build();
        dao.save(p3);
    }
}

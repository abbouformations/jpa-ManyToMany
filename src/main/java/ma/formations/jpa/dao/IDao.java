package ma.formations.jpa.dao;

import ma.formations.jpa.model.Personne;

import java.util.List;


public interface IDao {
    <T> void save(T t);
    List<Personne> getPersonnesByActivite(String description);
    void remove(String firstname,String lastname);
}

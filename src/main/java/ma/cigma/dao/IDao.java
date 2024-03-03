package ma.cigma.dao;

import ma.cigma.service.model.Activite;

public interface IDao {
	<T> void save(T t);
	Activite getActiviteBydescription(String description);
}

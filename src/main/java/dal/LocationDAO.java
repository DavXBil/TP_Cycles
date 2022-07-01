package dal;

import bo.Location;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

public class LocationDAO implements DAO<Location>{

    private final EntityManagerFactory emf = ConnectionManager.getInstance().getEmf();
    private final EntityManager em = emf.createEntityManager();
    @Override
    public void create(Location objet) throws DALException {
        try {
            em.getTransaction().begin();
            em.persist(objet);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new DALException("Erreur lors de la création du vélo", e);
        }
    }

    @Override
    public void update(Location objet) throws DALException {

    }

    @Override
    public void delete(Location objet) throws DALException {

    }

    @Override
    public List<Location> selectAll() throws DALException {
        TypedQuery<Location> query = em.createQuery("select e from Location", Location.class);
        return query.getResultList();
    }

    @Override
    public Location selectById(long id) throws DALException {
        return null;
    }
}

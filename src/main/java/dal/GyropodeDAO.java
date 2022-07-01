package dal;

import bo.Gyropode;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

public class GyropodeDAO implements DAO<Gyropode> {

    private final EntityManagerFactory emf = ConnectionManager.getInstance().getEmf();
    private final EntityManager em = emf.createEntityManager();


    @Override
    public void create(Gyropode objet) throws DALException {
        try {
            em.getTransaction().begin();
            em.persist(objet);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new DALException("Erreur lors de la création du vélo", e);
        }
    }

    @Override
    public void update(Gyropode objet) throws DALException {

    }

    @Override
    public void delete(Gyropode objet) throws DALException {

    }

    @Override
    public List<Gyropode> selectAll() throws DALException {
        TypedQuery<Gyropode> query = em.createQuery("select e from Gyropode", Gyropode.class);
        return query.getResultList();
    }

    @Override
    public Gyropode selectById(long id) throws DALException {
        return null;
    }
}

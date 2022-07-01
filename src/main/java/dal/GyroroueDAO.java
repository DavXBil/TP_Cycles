package dal;


import bll.ConnectionManager;
import bo.Gyroroue;
import bo.Velo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

public class GyroroueDAO implements DAO<Gyroroue> {

    private final EntityManagerFactory emf = ConnectionManager.getInstance().getEmf();
    private final EntityManager em = emf.createEntityManager();

    @Override
    public void create(Gyroroue objet) throws DALException {
        try {
            em.getTransaction().begin();
            em.persist(objet);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new DALException("Erreur lors de la création du vélo", e);
        }
    }

    @Override
    public void update(Gyroroue objet) throws DALException {

    }

    @Override
    public void delete(Gyroroue objet) throws DALException {

    }

    @Override
    public List<Gyroroue> selectAll() throws DALException {
        TypedQuery<Gyroroue> query = em.createQuery("select e from Gyroroue", Gyroroue.class);
        return query.getResultList();
    }

    @Override
    public Gyroroue selectById(long id) throws DALException {
        return null;
    }
}

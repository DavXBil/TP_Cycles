package dal;

import bo.Location;
import bo.Velo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

public class VeloDAO implements DAO<Velo> {

    private final EntityManagerFactory emf = ConnectionManager.getInstance().getEmf();
    private final EntityManager em = emf.createEntityManager();

    @Override
    public void create(Velo objet) throws DALException {
        try {
            em.getTransaction().begin();
            em.persist(objet);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new DALException("Erreur lors de la création du vélo", e);
        }
    }

    @Override
    public void update(Velo objet) throws DALException {

    }

    @Override
    public void delete(Velo objet) throws DALException {

    }

    @Override
    public List<Velo> selectAll() throws DALException {
        TypedQuery<Velo> query = em.createQuery("select e from Velo", Velo.class);
        return query.getResultList();
    }

    @Override
    public Velo selectById(long id) throws DALException {
        return em.find(Velo.class, id);
    }

}

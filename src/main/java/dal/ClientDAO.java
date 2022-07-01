package dal;

import bll.ConnectionManager;
import bo.Client;
import bo.Velo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

public class ClientDAO implements DAO<Client>{

    private final EntityManagerFactory emf = ConnectionManager.getInstance().getEmf();
    private final EntityManager em = emf.createEntityManager();

    @Override
    public void create(Client objet) throws DALException {
        try {
            em.getTransaction().begin();
            em.persist(objet);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new DALException("Erreur lors de la création du vélo", e);
        }
    }

    @Override
    public void update(Client objet) throws DALException {

    }

    @Override
    public void delete(Client objet) throws DALException {

    }

    @Override
    public List<Client> selectAll() throws DALException {
        TypedQuery<Client> query = em.createQuery("select e from Client", Client.class);
        return query.getResultList();
    }

    @Override
    public Client selectById(long id) throws DALException {
        return null;
    }
}

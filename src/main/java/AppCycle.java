import bll.LocationService;
import bo.Client;
import bo.Cycle;
import bo.Velo;
import dal.ClientDAO;
import dal.DALException;
import dal.DAOFactory;
import dal.VeloDAO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class AppCycle {


    public static void main(String[] args) throws DALException {

        VeloDAO veloDAO = DAOFactory.getVeloDAO();
        ClientDAO clientDAO = DAOFactory.getClientDAO();

        LocationService service = new LocationService();

        Velo newVelo = new Velo();

        newVelo.setMarque("Test");
        newVelo.setModele("XB22");
        newVelo.setDateAchat(LocalDate.now());
        newVelo.setVitesse(6);

        veloDAO.create(newVelo);

        Client newClient = new Client();
        newClient.setNom("Doe");
        newClient.setPrenom("Jane");
        newClient.setTaille(1.70f);
        newClient.setPortefeuille(500);

        clientDAO.create(newClient);

        Set<Cycle> velos = new HashSet<Cycle>();

        Velo velo = DAOFactory.getVeloDAO().selectById(1);

        velos.add(velo);
        Client client = clientDAO.selectById(2);

        service.louer(client, velos);
    }

}

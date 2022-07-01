import bo.Client;
import bo.Velo;
import dal.ClientDAO;
import dal.DALException;
import dal.DAOFactory;
import dal.VeloDAO;

import java.time.LocalDate;

public class AppCycle {


    public static void main(String[] args) throws DALException {

        VeloDAO veloDAO = DAOFactory.getVeloDAO();
        ClientDAO clientDAO = DAOFactory.getClientDAO();

        Velo velo = new Velo();
        Velo velo2 = new Velo();

        velo.setMarque("Test");
        velo.setModele("XB22");
        velo.setDateAchat(LocalDate.now());
        velo.setVitesse(6);

        velo2.setMarque("Test");
        velo2.setModele("XV88");
        velo2.setDateAchat(LocalDate.now());
        velo2.setVitesse(6);


        veloDAO.create(velo);
        veloDAO.create(velo2);

        Client client = new Client();
        client.setNom("Doe");
        client.setPrenom("Jane");
        client.setPortefeuille(500);

        clientDAO.create(client);

    }

}

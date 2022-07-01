package bll;

import bo.Client;
import bo.Cycle;
import bo.Location;
import bo.Velo;
import dal.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LocationService {



    public void louer(Client client, Set<Cycle> velos) throws DALException {

        LocationDAO locDao = DAOFactory.getLocationDAO();
        Location location = new Location();


        location.setDebutLocation(LocalDate.now());
        location.setFinLocation(LocalDate.now().plusDays(7));


        location.setClient(client);
        location.setCycles(velos);

        locDao.create(location);

    }

}

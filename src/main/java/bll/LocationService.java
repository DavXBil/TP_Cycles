package bll;

import bo.Location;
import bo.Velo;
import dal.DALException;
import dal.DAOFactory;
import dal.LocationDAO;

import java.util.HashSet;
import java.util.Set;

public class LocationService {


    public void louer() throws DALException {

        LocationDAO locDao = DAOFactory.getLocationDAO();

        Location location = new Location();

        Set<Velo> velos = new HashSet<Velo>();

        Velo velo = DAOFactory.getVeloDAO().selectById(1);

        velos.add(velo);

        System.out.println(velos);

    }

}

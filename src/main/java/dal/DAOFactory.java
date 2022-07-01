package dal;


public class DAOFactory {

	public static VeloDAO getVeloDAO() {
		return new VeloDAO();
	}

	public static GyroroueDAO getGyroroueDAO() {
		return new GyroroueDAO();
	}

	public static GyropodeDAO getGyropodeDAO() {
		return new GyropodeDAO();
	}
	public static ClientDAO getClientDAO() {
		return new ClientDAO();
	}

	public static LocationDAO getLocationDAO() {
		return new LocationDAO();
	}
}

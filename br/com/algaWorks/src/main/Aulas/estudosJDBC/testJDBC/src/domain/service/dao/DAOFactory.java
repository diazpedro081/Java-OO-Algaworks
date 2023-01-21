package domain.service.dao;

import domain.service.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

	public static DAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClientDAO getClienteDAO();
	
}
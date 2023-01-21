package domain.service.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import domain.service.dao.ClientDAO;
import domain.service.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cadastro_cliente";
    static final String USER = "root";
    static final String PASS = "suaSenha";

	private Connection connection;
	
	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			throw new RuntimeException("Error retrieving database connection", e);
		}
	}

	@Override
	public ClientDAO getClienteDAO() {
		return new JdbcClientDAO(connection);
	}
	
}
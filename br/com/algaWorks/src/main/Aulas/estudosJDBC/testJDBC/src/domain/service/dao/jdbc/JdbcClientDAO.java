package domain.service.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.exception.DAOException;
import domain.model.Client;
import domain.service.dao.ClientDAO;

public class JdbcClientDAO implements ClientDAO {

	public static final String GENERIC_SEARCH_ERROR_MSG 
		= "An error occurred while performing this search.";

	private Connection connection;

	public JdbcClientDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void salvar(Client cliente) {
		try {
			String sql = String.format(
					"insert into cliente (nome) values ('%s')",
					cliente.getName());

			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Error saving client", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}
	}

	@Override
	public Client buscarPeloCodigo(Long codigo) {
		Client cliente = null;

		try {
			String sql = String.format(
					"select * from cliente where codigo = %d", codigo);
			PreparedStatement ps = this.connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				cliente = new Client();
				cliente.setCode(rs.getLong("codigo"));
				cliente.setName(rs.getString("nome"));
			}

		} catch (SQLException e) {
			throw new DAOException(GENERIC_SEARCH_ERROR_MSG, e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}

		return cliente;
	}

	@Override
	public List<Client> buscarTodos() {
		List<Client> clientes = new ArrayList<>();
		try {
			String sql = "select * from cliente";
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Client cliente = new Client();
				cliente.setCode(rs.getLong("codigo"));
				cliente.setName(rs.getString("nome"));
				
				clientes.add(cliente);
			}
			
		} catch (SQLException e) {
			throw new DAOException(GENERIC_SEARCH_ERROR_MSG, e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}

		return clientes;
	}

}
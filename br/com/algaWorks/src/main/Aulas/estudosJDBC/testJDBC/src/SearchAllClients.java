import java.util.List;

import domain.model.Client;
import domain.service.dao.ClientDAO;
import domain.service.dao.DAOFactory;

public class SearchAllClients {
    public static void main(String[] args) {
		ClientDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		List<Client> clientes = clienteDAO.buscarTodos();
		
		for (Client cliente : clientes) {
			System.out.printf("Código: %d\n", cliente.getCode());
			System.out.printf("Nome: %s\n", cliente.getName());
		}
	}
	
}
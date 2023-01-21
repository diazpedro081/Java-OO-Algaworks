import domain.model.Client;
import domain.service.dao.ClientDAO;
import domain.service.dao.DAOFactory;

public class SearchForCode {
    public static void main(String[] args) {
		ClientDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		Client cliente = clienteDAO.buscarPeloCodigo(2L);
		
		if (cliente != null) {
			System.out.printf("Código: %d\n", cliente.getCode());
			System.out.printf("Nome: %s\n", cliente.getName());
		} else {
			System.out.println("No customers found.");
		}
	}
	
}
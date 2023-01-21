import domain.model.Client;
import domain.service.dao.ClientDAO;
import domain.service.dao.DAOFactory;

public class SaveCustomer {
    public static void main(String[] args) throws Exception {

		Client cliente = new Client();

			cliente.setName("Steve");
		
			ClientDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
			clienteDAO.salvar(cliente);
			System.out.println("Client successfully saved.");
		
	}
	
}
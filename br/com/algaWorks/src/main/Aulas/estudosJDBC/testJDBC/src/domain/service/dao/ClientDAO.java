package domain.service.dao;

import java.util.List;

import domain.model.Client;

public interface ClientDAO {

	public void salvar(Client cliente);

	public Client buscarPeloCodigo(Long codigo);

	public List<Client> buscarTodos();
	
}
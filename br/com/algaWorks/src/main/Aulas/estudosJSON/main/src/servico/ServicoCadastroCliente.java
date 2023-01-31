package br.com.algaWorks.src.main.Aulas.estudosJSON.main.src.servico;

import java.util.ArrayList;
import java.util.List;

import br.com.algaWorks.src.main.Aulas.estudosJSON.main.src.modelo.Cliente;
import br.com.algaWorks.src.main.Aulas.estudosJSON.main.src.modelo.Endereco;
import br.com.algaWorks.src.main.Aulas.estudosJSON.main.src.modelo.Telefone;


public class ServicoCadastroCliente {
    /*
     * Formato criar como exemplo de estudos json 
     * da forma correta seria criada a logica onde na hora de chamar o metodo seria solicitado os dados do cliente a ser cadastro e em seguida seria inserido no banco de dados
     */
    public Cliente cadastrarCLiente() {

        Endereco endereco = new Endereco("Rua das Flores, 37", "São Paulo", "SP");

        Telefone residencial = new Telefone();
        residencial.setTipo("RESIDENCIAL");
        residencial.setNumero("11 9 94491775");

        Telefone comercial = new Telefone();
        comercial.setTipo(" COMERCIAL");
        comercial.setNumero("11 9 34497125");

        List<Telefone> telefones = new ArrayList<>();
        telefones.add(residencial);
        telefones.add(residencial);

        Cliente cliente = new Cliente("João ", 19, endereco, telefones);

        return cliente;

 }

    @Override
    public String toString() {
        return "ServicoCadastroCliente []";
    }

}
package br.com.algaWorks.src.main.Aulas.sobrecarga;

public class TesteCadastro {

    public static void main(String[] args) {
        CadastroPessoa cadastroPessoa = new CadastroPessoa();

        Pessoa pessoa = new Pessoa("Jorge", 40);
        cadastroPessoa.cadastrar(pessoa);

        cadastroPessoa.cadastrar("Pedro", 25);
    }
    
}

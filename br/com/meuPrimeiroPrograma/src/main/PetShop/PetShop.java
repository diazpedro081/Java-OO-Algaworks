package br.com.meuPrimeiroPrograma.src.main.PetShop;

public class PetShop {
    public static void main(String[] args) {
        Cachorro primeiroCachorro = new Cachorro();

        primeiroCachorro.setNome("Ruy");
        primeiroCachorro.setRaça("Poodle");
        primeiroCachorro.setSexo('M');
        primeiroCachorro.setIdade(3);

        System.out.println(primeiroCachorro);
    }
}

package br.com.algaWorks.src.main.Aulas.petShop;

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

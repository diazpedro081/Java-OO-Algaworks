package br.com.algaWorks.src.main.Aulas.arquivosProperties.src.curso;

import java.io.FileInputStream;
import java.util.Properties;

public class LendoArquivoProperties {
    
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("./config/config.properties"));

        // Conectar no banco de dados...
        String url = prop.getProperty("banco.dados.url");
        String usuario = prop.getProperty("banco.dados.usuario");
        //String senha = prop.getProperty("banco.dados.senha");

        System.out.printf("Conectando no banco de dados de url: %s e usuario: %$\n", url, usuario);

        try {
            int x = 5 / 0;
            System.out.println(x);
        } catch (Exception e) {
            // Se acontecer algum erro, voce precisa informar o adiministrador
            String email = prop.getProperty("email.admin");
            System.err.printf("Enviado email para: %s informando o erro: %s", email, e.getMessage());
        }
    }
}

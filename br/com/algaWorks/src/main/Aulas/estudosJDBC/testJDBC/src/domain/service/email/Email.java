package domain.service.email;

import java.util.Scanner;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class Email {
    
    public void emailsSend(String... emails) {
        
        for(String email : emails){

            Scanner entrada = new Scanner(System.in);
            
            String userNameEmail = "stevetestador@gmail.com";
            String passwordEmail = "orbnewttyueoxtgt";
            
            
            SimpleEmail simpleEmail = new SimpleEmail();
            simpleEmail.setHostName("smtp.gmail.com");
            simpleEmail.setSmtpPort(465);
            simpleEmail.setAuthenticator(new DefaultAuthenticator(userNameEmail, passwordEmail));
            simpleEmail.setSSLOnConnect(true);
            
            try {
                simpleEmail.setFrom(userNameEmail);
                System.out.print("Titulo do Email: ");
                simpleEmail.setSubject(entrada.nextLine());
                System.out.println("Escreva a mensagem a ser enviada. \n");
                simpleEmail.setMsg(entrada.nextLine());
                simpleEmail.addTo(emails);
                simpleEmail.send();
                System.out.println("Successfully sent Email to " + email);
                
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

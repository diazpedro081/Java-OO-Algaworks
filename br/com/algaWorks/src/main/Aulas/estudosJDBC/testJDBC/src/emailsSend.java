import domain.service.email.Email;

public class emailsSend {

    public static void main(String[] args) {
        
        Email email = new Email();
        
        email.emailsSend("081diazpedro@gmail.com",
         "stevetestador@gmail.com");
    }
}

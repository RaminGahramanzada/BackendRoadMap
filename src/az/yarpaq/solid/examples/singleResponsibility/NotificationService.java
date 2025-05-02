package az.yarpaq.solid.examples.singleResponsibility;

public class NotificationService {
    public void sendEmail(String accountId, String message){
        System.out.println("Email: "+accountId+" - "+message);
    }
}

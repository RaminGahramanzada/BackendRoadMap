package az.yarpaq.solid.examples.dependencyinversion;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

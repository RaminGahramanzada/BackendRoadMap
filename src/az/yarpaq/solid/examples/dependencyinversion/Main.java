package az.yarpaq.solid.examples.dependencyinversion;

public class Main {
    public static void main(String[] args) {

        MessageService smsService = new EmailService();
        Notification smsNotification = new Notification(smsService);
        smsNotification.notifyUser("Hello via SMS!");

        MessageService emailService = new EmailService();
        Notification emailNotification = new Notification(emailService);
        emailNotification.notifyUser("Hello via Email!");
    }
}


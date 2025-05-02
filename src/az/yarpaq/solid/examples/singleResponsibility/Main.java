package az.yarpaq.solid.examples.singleResponsibility;

public class Main {
    public static void main(String[] args) {

        LoggerService loggerService = new LoggerService();
        NotificationService notificationService = new NotificationService();

        TransactionService transactionService = new TransactionService(loggerService,notificationService);

        transactionService.withdraw("Ramin",2300.00);

    }
}

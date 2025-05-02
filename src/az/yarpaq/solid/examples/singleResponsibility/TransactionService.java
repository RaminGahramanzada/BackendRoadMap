package az.yarpaq.solid.examples.singleResponsibility;

public class TransactionService {
    private LoggerService loggerService;
    private NotificationService notificationService;

    public TransactionService(LoggerService loggerService,NotificationService notificationService){
        this.loggerService = loggerService;
        this.notificationService = notificationService;
    }

    public void withdraw(String accountId, double amount){
        System.out.println("Balansdan "+ amount+" AZN cixildi. Hesab: "+accountId);
        loggerService.log("Withdraw: "+amount+" AZN from account "+ accountId);
        notificationService.sendEmail(accountId,"Hesabinizdan "+ amount+" AZN cixildi.");
    }
}

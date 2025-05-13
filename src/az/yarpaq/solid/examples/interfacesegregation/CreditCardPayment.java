package az.yarpaq.solid.examples.interfacesegregation;

public class CreditCardPayment  implements CardPayment {

    @Override
    public void payWithCard(String cardNumber, double amount) {
        System.out.println("Payment of " + amount + " made with credit card: " + cardNumber);
    }
}

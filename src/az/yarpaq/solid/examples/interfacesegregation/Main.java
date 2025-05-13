package az.yarpaq.solid.examples.interfacesegregation;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment cp  = new CreditCardPayment();
        cp.payWithCard("1234-5678-9012-3456", 100.0);
    }
}

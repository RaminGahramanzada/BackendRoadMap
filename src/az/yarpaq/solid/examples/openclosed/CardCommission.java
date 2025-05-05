package az.yarpaq.solid.examples.openclosed;

public class CardCommission implements CommissionStrategy {
    @Override
    public double calculate(double amount) {
        return amount*0.015;
    }
}

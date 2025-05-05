package az.yarpaq.solid.examples.openclosed;

public class BankCommission implements  CommissionStrategy{
    @Override
    public double calculate(double amount) {
        return amount*0.02 ;
    }
}

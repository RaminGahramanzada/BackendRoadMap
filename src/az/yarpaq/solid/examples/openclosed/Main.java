package az.yarpaq.solid.examples.openclosed;

public class Main {
    public static void main(String[] args) {

/*        CommissionCalculator cm = new CommissionCalculator();
        double commission = cm.calculate("bank", 100);
        System.out.println(commission+"AZN");
        */

        CommissionCalculator commissionCalculator = new CommissionCalculator();
        double result1 = commissionCalculator.calculate(new BankCommission(),1000);
        double result2 = commissionCalculator.calculate(new CardCommission(),1000);
        System.out.println("Bank:"+result1);
        System.out.println("Kart:"+result2);

    }
}

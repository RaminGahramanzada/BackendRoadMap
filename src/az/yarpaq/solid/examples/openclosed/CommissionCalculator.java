package az.yarpaq.solid.examples.openclosed;

public class CommissionCalculator {
/*
    public double calculate(String method, double amount){
        if(method.equals("bank")){
            return amount *0.02;
        }else if (method.equals("card")){
            return  amount * 0.015;
        } else if (method.equals("crypto")) {
            return amount*0.005;
        }else{
            return 0;
        }
    }
*/
    public  double calculate(CommissionStrategy strategy,
                             double amount){
        return strategy.calculate(amount);
    }
}

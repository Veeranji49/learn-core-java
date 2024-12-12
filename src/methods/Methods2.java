package methods;

public class Methods2 {

    static double currentBalance = 29000;

    public static void main(String[] args) {
        greet();
        Methods2 methods2 = new Methods2();

        double balance = methods2.checkCurrentBalance();
        System.err.println(balance);

        methods2.depositAmount(48394.00);

        methods2.withDrawlAmount(43874.00);

    }

    public static void greet() {
        System.err.println("Welcome to the Canara Bank");
    }

    public double checkCurrentBalance() {
        return currentBalance;
    }

    public void depositAmount(double amount) {
        currentBalance = currentBalance + amount;
        System.err.println(currentBalance);
    }

    public void withDrawlAmount(double amount) {
        currentBalance = currentBalance - amount;
        System.err.println(currentBalance);
    }

}
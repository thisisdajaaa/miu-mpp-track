package lesson4.prob4c.models;

public record Paycheck(Double grossPay) {
    private static final double fica = 0.23;
    private static final double stateTax = 0.05;
    private static final double localTax = 0.01;
    private static final double medicare = 0.03;
    private static final double socialSecurity = 0.075;

    public void print() {
        System.out.printf("Paycheck gross pay: %s", grossPay);
    }

    public double getNetPay() {
        return grossPay - (grossPay * (fica + stateTax + localTax + medicare + socialSecurity));
    }
}

package strategy;

public class Main {
    public static void main(String[] args) {

        PaymentContext payment1 = new PaymentContext();
        payment1.setStrategy(new CreditCardPayment());
        payment1.executePayment(100_000);

        PaymentContext payment2 = new PaymentContext();
        payment2.setStrategy(new EwalletPayment());
        payment2.executePayment(200_000);

    }
}

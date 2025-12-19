package strategy;

// Concrete Strategy
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Bayar -> " + amount + " Menggunakan Credit Card");
    }
}

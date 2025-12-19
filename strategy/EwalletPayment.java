package strategy;

public class EwalletPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Bayar -> " + amount + " Menggunakan E-Wallet");
    }
}

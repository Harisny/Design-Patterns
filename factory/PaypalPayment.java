package factory;

public class PaypalPayment implements Payment {

    @Override
    public void pay(Integer amount) {
        System.out.println("Bayar " + amount + " Menggunakan Paypal");
    }

}

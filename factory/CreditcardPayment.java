package factory;

public class CreditcardPayment implements Payment {

    @Override
    public void pay(Integer amount) {
        System.out.println("Bayar " + amount + " menggunakan Credit");
    }

}

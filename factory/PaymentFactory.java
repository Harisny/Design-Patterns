package factory;

public class PaymentFactory {

    public static Payment create(String type) {
        if (type.equals("CREDIT")) {
            return new CreditcardPayment();
        } else if (type.equals("PAYPAL")) {
            return new PaypalPayment();
        } else {
            throw new IllegalArgumentException("Pembayaran tidak dikenal");
        }
    }
}

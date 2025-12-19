package factory;

public class Main {
    public static void main(String[] args) {
        // ** Simple Factory
        Payment payment1 = new PaymentFactory().create("CREDIT");
        payment1.pay(100_000);

        Payment payment2 = new PaymentFactory().create("PAYPAL");
        payment2.pay(100_000);

        // ** Factory method
        NotificationFactory factory1 = new EmailNotificationFactory();
        // Object email
        Notification email = factory1.create();
        email.send("Halo");

        NotificationFactory factory2 = new SmsNotificationFactory();
        // Object sms
        Notification sms = factory2.create();
        sms.send("Halo");

    }
}

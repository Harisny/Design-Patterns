package factory;

public class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Kirim SMS: " + message);
    }

}

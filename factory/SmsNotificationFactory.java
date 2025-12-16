package factory;

public class SmsNotificationFactory extends NotificationFactory {

    @Override
    public Notification create() {
        return new SmsNotification();
    }
}

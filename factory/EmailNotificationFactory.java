package factory;

// concreat object
public class EmailNotificationFactory extends NotificationFactory {
    // create object email
    @Override
    public Notification create() {
        return new EmailNotification();
    }

}

package factory;

public abstract class NotificationFactory {
    public abstract Notification create();

    public void ping() {
        System.out.println("ping notification");
    }
}

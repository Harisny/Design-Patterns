package singleton;

public class DatabaseConnection1 {
    public DatabaseConnection1() {
        System.out.println("Database Connection1 dibuat " + this);
    }

    public void connection(String message) {
        System.out.println("connection : " + message);
    }
}

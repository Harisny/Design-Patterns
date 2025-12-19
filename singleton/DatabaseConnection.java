package singleton;

public class DatabaseConnection {
    // instance disimpan dalam static
    private static DatabaseConnection instance;

    // construct dibuat private supaya tidak bisa di buat object baru new
    private DatabaseConnection() {
    }

    // mengakases instance melalui method khusus
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

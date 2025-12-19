package singleton;

public class Main {
    public static void main(String[] args) {
        // singleton
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println(db1 == db2);
        System.out.println("ini db1 : " + db1);
        System.out.println("ini db2 : " + db2);
        // hasilnya akan sama
        // true
        // ini db1 : DatabaseConnection@28a418fc
        // ini db2 : DatabaseConnection@28a418fc

        // plan object dan bukan singleton
        DatabaseConnection1 db3 = new DatabaseConnection1();
        DatabaseConnection1 db4 = new DatabaseConnection1();

        System.out.println(db3 == db4);
        System.out.println("ini db3 : " + db3);
        System.out.println("ini db4 : " + db4);
        // hasilnya akan berbeda
        // false
        // ini db3 : DatabaseConnection1@65b54208
        // ini db4 : DatabaseConnection1@1be6f5c3

    }
}

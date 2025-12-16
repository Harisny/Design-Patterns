package prototype;

public class Main {
    public static void main(String[] args) {
        // plan object tanpa menggunakan prototype
        User us1 = new User("AHOK", "ADMIN", 20);
        User us2 = new User("ANIS", "ADMIN", 20);
        // membuat object dari nol menggunakan new
        // Parameter diulang-ulang
        // Kalau struktur berubah → semua new rusak

        System.out.println("plan object user : " + us1);
        System.out.println("plan object user : " + us2);
        System.out.println(us1 == us2);

        // menggunakan prototype
        UserProfile adminTemplate = new UserProfile("Default", "ADMIN", 20);

        UserProfile admin1 = adminTemplate.clone();
        admin1.setName("AHOK");
        admin1.setAge(20);
        UserProfile admin2 = adminTemplate.clone();
        admin2.setName("ANIS");
        admin2.setAge(21);

        System.out.println("prototype object : " + adminTemplate);
        System.out.println("prototype object : " + admin1);
        System.out.println("prototype object : " + admin2);
        System.out.println(admin1 == admin2);
    }
}

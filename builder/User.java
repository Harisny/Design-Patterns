package builder;

public class User {

    private String name;
    private String role;
    private int age;
    private String address;
    private String phone;
    private boolean active;

    public User(
            String name,
            String role,
            int age,
            String address,
            String phone,
            boolean active) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.address = address;
        this.phone = address;
        this.active = active;
    }

    @Override
    public String toString() {
        return name + ", " + role + ", " + age + ", " +
                address + ", " + phone + ", active=" + active;
    }
}

package prototype;

public class User {
    private String name;
    private String role;
    private Integer age;

    public User(String name, String role, Integer age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + role + " - " + age;
    }
}

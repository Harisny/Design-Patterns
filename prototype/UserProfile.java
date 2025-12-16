package prototype;

public class UserProfile implements Cloneable {
    private String name;
    private String role;
    private Integer age;

    public UserProfile(String name, String role, Integer age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    // Copy Construct
    private UserProfile(UserProfile source) {
        this.name = source.name;
        this.role = source.role;
        this.age = source.age;
    }

    public UserProfile clone() {
        return new UserProfile(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + role + " - " + age;
    }
}

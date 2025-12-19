package builder;

public class UserSchemaBuilder {
    private String name;
    private String role;
    private int age;
    private String address;
    private String phone;
    private boolean active;

    public UserSchemaBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserSchemaBuilder role(String role) {
        this.role = role;
        return this;
    }

    public UserSchemaBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserSchemaBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserSchemaBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserSchemaBuilder active(boolean active) {
        this.active = active;
        return this;
    }

    public UserSchema build() {
        return new UserSchema(name, role, age, address, phone, active);
    }

}

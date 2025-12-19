package builder;

public class CarSchemaBuilder implements Builder {
    // Jangan di Encapsulation
    int id;
    String brand;
    String model;
    String color;

    @Override
    public Builder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Builder color(String color) {
        this.color = color;
        return this;
    }

    public CarSchema build() {
        return new CarSchema(this);
    }
}

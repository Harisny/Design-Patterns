package builder;

public class CarSchema {
    private int id;
    private String brand;
    private String model;
    private String color;

    // (Optional) Construct biasa
    public CarSchema(int id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    // Construct builder
    public CarSchema(CarSchemaBuilder builder) {
        this.id = builder.id;
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return id + ", " + brand + ", " + model + ", " + color;
    }

}

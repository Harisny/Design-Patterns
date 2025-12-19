package builder;

public class Director {

    public void buildBuggati(CarSchemaBuilder builder) {
        builder.id(1001)
                .brand("Buggati")
                .model("V1.ENGINE")
                .color("GOLD");
    }

    public void buildLamborgini(CarSchemaBuilder builder) {
        builder.id(1002)
                .brand("Lamborgini")
                .model("V2.ENGINE")
                .color("SILVER");
    }
}

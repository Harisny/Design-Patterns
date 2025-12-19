package builder;

public class Main {
        public static void main(String[] args) {
                // ** tanpa Builder
                User us1 = new User("Haris",
                                "ADMIN",
                                22,
                                "Jakarta",
                                "0812345678",
                                true);

                System.out.println(us1);

                // ** Builder
                UserSchema admin = new UserSchemaBuilder().name("Haris")
                                .role("ADMIN")
                                .age(22)
                                .address("Jakarta")
                                .phone("0812345678")
                                .active(true)
                                .build();

                UserSchema employee = new UserSchemaBuilder().name("JONO")
                                .role("IT")
                                .phone("0812340808")
                                .address("Bandung")
                                .active(true)
                                .age(25)
                                .build();

                System.out.println(admin);
                System.out.println(employee);

                // ** Builder Dengan Director
                Director director = new Director();
                CarSchemaBuilder builder = new CarSchemaBuilder();

                // build object 1
                director.buildBuggati(builder);
                CarSchema car1 = builder.build();

                // build object 2
                director.buildLamborgini(builder);
                CarSchema car2 = builder.build();

                System.out.println(car1);
                System.out.println(car2);
        }
}

package factory.builder;

public class PizzaDirector {
    public Pizza buildCustomPizza() {
        return new PizzaBuilder()
                .setSize("Large")
                .setSpiciness(true)
                .addExtraCheese(true)
                .addPepperoni(true)
                .build();
    }
}

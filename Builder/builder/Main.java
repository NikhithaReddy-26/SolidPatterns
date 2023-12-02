package factory.builder;

public class Main {
    public static void main(String[] args) {
        PizzaDirector pizzaDirector = new PizzaDirector();
        Pizza customPizza = pizzaDirector.buildCustomPizza();
        System.out.println(customPizza.toString());

        Pizza normalPizza = new PizzaBuilder().setSize("Small").setSpiciness(true).build();
        System.out.println(normalPizza.toString());
    }
}

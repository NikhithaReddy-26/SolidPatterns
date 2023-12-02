package factory.builder;


public class PizzaBuilder {
    private String size;
    private boolean isSpicy;
    private boolean hasExtraCheese;
    private boolean hasPepperoni;

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setSpiciness(boolean isSpicy) {
        this.isSpicy = isSpicy;
        return this;
    }

    public PizzaBuilder addExtraCheese(boolean hasExtraCheese) {
        this.hasExtraCheese = hasExtraCheese;
        return this;
    }

    public PizzaBuilder addPepperoni(boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, isSpicy, hasExtraCheese, hasPepperoni);
    }
}


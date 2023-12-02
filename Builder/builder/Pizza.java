package factory.builder;

public class Pizza {
    private String size;
    private boolean isSpicy;
    private boolean hasExtraCheese;
    private boolean hasPepperoni;

    public Pizza(String size, boolean isSpicy, boolean hasExtraCheese, boolean hasPepperoni) {
        this.size = size;
        this.isSpicy = isSpicy;
        this.hasExtraCheese = hasExtraCheese;
        this.hasPepperoni = hasPepperoni;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", isSpicy=" + isSpicy +
                ", hasExtraCheese=" + hasExtraCheese +
                ", hasPepperoni=" + hasPepperoni +
                '}';
    }
}

package factoryDesignPatternViolation;

import factoryDesignPattern.Order;

public class RegularOrder implements Order {
    @Override
    public void processOrder() {
        System.out.println("Processing a regular order.");
    }
}
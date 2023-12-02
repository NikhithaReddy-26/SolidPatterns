package factoryDesignPatternViolation;

import factoryDesignPattern.Order;

public class InternationalOrder implements Order {
    @Override
    public void processOrder() {
        System.out.println("Processing an international order.");
    }
}
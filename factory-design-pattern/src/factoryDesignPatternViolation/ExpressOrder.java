package factoryDesignPatternViolation;

import factoryDesignPattern.Order;

public class ExpressOrder implements Order {
    @Override
    public void processOrder() {
        System.out.println("Processing an express order.");
    }
}
package factoryDesignPatternViolation;

import factoryDesignPattern.ExpressOrder;
import factoryDesignPattern.InternationalOrder;
import factoryDesignPattern.Order;
import factoryDesignPattern.OrderFactory;

public class Main {
    public static void main(String[] args) {

        
        Order regularOrder = new RegularOrder();
        regularOrder.processOrder();

        Order expressOrder = new ExpressOrder();
        expressOrder.processOrder();

        Order internationalOrder = new InternationalOrder();
        internationalOrder.processOrder();
    }
}
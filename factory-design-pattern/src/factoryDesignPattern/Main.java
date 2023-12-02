package factoryDesignPattern;

public class Main {
    public static void main(String[] args) {

        Order regularOrder = OrderFactory.createOrder("regular");
        regularOrder.processOrder();

        Order expressOrder = OrderFactory.createOrder("express");
        expressOrder.processOrder();

        Order internationalOrder = OrderFactory.createOrder("international");
        internationalOrder.processOrder();
    }
}
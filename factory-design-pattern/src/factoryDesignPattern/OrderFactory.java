package factoryDesignPattern;

public class OrderFactory {
    public static Order createOrder(String orderType) {
        switch (orderType) {
            case "regular":
                return new RegularOrder();
            case "express":
                return new ExpressOrder();
            case "international":
                return new InternationalOrder();
            default:
                throw new IllegalArgumentException("Invalid order type: " + orderType);
        }
    }
}
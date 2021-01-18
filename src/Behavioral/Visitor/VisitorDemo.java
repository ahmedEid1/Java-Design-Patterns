package Behavioral.Visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        PartsOrders order = new PartsOrders();
        order.addPart(new Part1());
        order.addPart(new Part2());
        order.addPart(new Part3());

        order.accept(new ShippingPartVisitor());

    }
}

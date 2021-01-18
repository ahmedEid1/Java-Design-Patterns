package Behavioral.Visitor;

public class ShippingPartVisitor implements PartVisitor{
    @Override
    public void visit(Part1 part1) {
        System.out.println("shipping 1");
    }

    @Override
    public void visit(Part2 part2) {
    System.out.println("shipping 2");

    }

    @Override
    public void visit(Part3 part3) {
        System.out.println("shipping 3");
    }

    @Override
    public void visit(PartsOrders partsOrders) {
    System.out.println("shipping for an Order");

    }
}

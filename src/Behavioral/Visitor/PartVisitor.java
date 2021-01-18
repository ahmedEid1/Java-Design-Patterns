package Behavioral.Visitor;

public interface PartVisitor {

    public void visit(Part1 part1);

    public void visit(Part2 part2);

    public void visit(Part3 part3);

    public void visit(PartsOrders partsOrders);
}

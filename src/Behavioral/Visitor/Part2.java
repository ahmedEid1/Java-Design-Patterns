package Behavioral.Visitor;

public class Part2 implements Part{
    @Override
    public void accept(PartVisitor partVisitor) {
        partVisitor.visit(this);
    }
}

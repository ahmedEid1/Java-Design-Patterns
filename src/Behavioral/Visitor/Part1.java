package Behavioral.Visitor;

public class Part1 implements Part{

    @Override
    public void accept(PartVisitor partVisitor) {
        partVisitor.visit(this);
    }
}

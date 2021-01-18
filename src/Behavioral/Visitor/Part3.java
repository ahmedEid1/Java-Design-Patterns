package Behavioral.Visitor;

public class Part3 implements Part{
    @Override
    public void accept(PartVisitor partVisitor) {
        partVisitor.visit(this);
    }
}

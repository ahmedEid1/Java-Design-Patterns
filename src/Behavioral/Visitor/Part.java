package Behavioral.Visitor;

public interface Part {
    public void accept(PartVisitor partVisitor);
}

package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class PartsOrders implements Part {
    private List<Part> parts = new ArrayList<>();

    public PartsOrders() {

    }

    public void addPart(Part part) {
        parts.add(part);
    }

    public List<Part> getParts() {
        return parts;
    }

    @Override
    public void accept(PartVisitor partVisitor) {
        for (Part part : parts){
            part.accept(partVisitor);
        }
        partVisitor.visit(this);
    }
}

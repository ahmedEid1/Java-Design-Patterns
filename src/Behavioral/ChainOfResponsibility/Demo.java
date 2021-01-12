package Behavioral.ChainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        Director ahmed = new Director();
        Vip eid = new Vip();

        ahmed.setSuccessor(eid);

        Request request = new Request(RequestType.PURCHASE);

        ahmed.handleRequest(request);
    }
}

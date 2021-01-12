package Behavioral.ChainOfResponsibility;

public class Vip extends Handler{
    @Override
    public void handleRequest(Request request) {
        System.out.println("VIP can handle anything");
    }
}

package Behavioral.TemplateMethod;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("web checkout");
    }

    @Override
    public void doPayment() {
        System.out.println("web payment");
    }

    @Override
    public void doReceipt() {
        System.out.println("receipt");
    }
}

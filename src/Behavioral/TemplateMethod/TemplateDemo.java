package Behavioral.TemplateMethod;

public class TemplateDemo {

    public static void main(String[] args) {
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();
    }
}

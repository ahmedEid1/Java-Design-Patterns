package Creational.Builder;

public class LaunchOrderTester {
    public static void main(String[] args) {
        LaunchOrder.Builder builder = new LaunchOrder.Builder();

        builder.bread("bread").condiments("something").meat("beef");

        LaunchOrder order = builder.build();

        System.out.println(order.getBreed());
        System.out.println(order.getMeat());
        System.out.println(order.getCondiments());
    }
}

package Behavioral.State;

public class StateDemo {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
    }
}

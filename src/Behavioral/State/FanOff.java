package Behavioral.State;

public class FanOff extends State {
    private Fan fan;

    public FanOff(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turn On LOW");
        fan.setState(fan.getFanLow());
    }

    @Override
    public String toString() {
        return "FanOff{" +
                "fan=" + fan +
                '}';
    }
}

package Behavioral.State;

public class FanLow extends State {
    private Fan fan;

    public FanLow(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("switching to Mid");
        fan.setState(fan.getFanMid());
    }
}

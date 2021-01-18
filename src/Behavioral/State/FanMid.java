package Behavioral.State;

public class FanMid extends State {
    private Fan fan;

    public FanMid(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning the fan off");
        fan.setState(fan.getFanOff());
    }
}

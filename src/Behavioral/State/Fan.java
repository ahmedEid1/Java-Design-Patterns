package Behavioral.State;

public class Fan {
    State fanOff;
    State fanLow;
    State fanMid;
    State state;

    public Fan() {
        this.fanOff = new FanOff(this);
        this.fanLow = new FanLow(this);
        this.fanMid = new FanMid(this);
        state = fanOff;
    }


    public void setState(State state) {
        this.state = state;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public State getFanOff() {
        return fanOff;
    }

    public State getFanLow() {
        return fanLow;
    }

    public State getFanMid() {
        return fanMid;
    }


}

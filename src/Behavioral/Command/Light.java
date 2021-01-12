package Behavioral.Command;

public class Light {
    private boolean isOn = false;

    public void toggle() {
        if (isOn) {
            this.off();
        } else {
            this.on();
        }
    }

    public void on() {
        this.isOn = true;
        System.out.println("Light on");
    }

    public void off() {
        this.isOn = false;
        System.out.println("Light off");
    }

}

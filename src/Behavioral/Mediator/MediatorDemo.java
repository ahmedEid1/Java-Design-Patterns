package Behavioral.Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light light1 = new Light();
        Light light2 = new Light();

        mediator.registerLight(light1);
        mediator.registerLight(light2);

        Command turnOnLights = new AllLightsCommand(mediator);

        turnOnLights.execute();
    }
}

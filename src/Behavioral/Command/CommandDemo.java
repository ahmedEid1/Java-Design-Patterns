package Behavioral.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        Light light1 = new Light();
        Light light2 = new Light();
        Light light3 = new Light();

        Switch aSwitch = new Switch();

//        Command toggleCommand = new ToggleCommand(light1);
//        aSwitch.storeAndExecute(toggleCommand);
//        aSwitch.storeAndExecute(toggleCommand);
//        aSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();

        lights.add(light1);
        lights.add(light2);
        lights.add(light3);

        Command allLightsCommand = new AllLightsCommand(lights);

        aSwitch.storeAndExecute(allLightsCommand);
        aSwitch.storeAndExecute(allLightsCommand);
        aSwitch.storeAndExecute(allLightsCommand);

    }
}

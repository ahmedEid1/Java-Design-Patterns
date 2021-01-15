package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOnLights() {
        for (Light light : lights){
            if (!light.isOn())
                light.on();

        }
    }
}

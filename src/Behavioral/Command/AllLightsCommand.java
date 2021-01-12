package Behavioral.Command;

import java.util.List;

public class AllLightsCommand implements Command {
    private List<Light> lightList;

    public AllLightsCommand(List<Light> list){
        this.lightList = list;
    }

    @Override
    public void execute() {
        for (Light light : lightList){
            light.toggle();
        }
    }
}

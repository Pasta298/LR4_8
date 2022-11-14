package main.menu;

import main.aviacompany.Aviacompany;
import main.utilities.PlaneUtils;

import java.util.List;

public class AddPlaneCommand implements Command{
    private final Aviacompany aviacompany;

    public AddPlaneCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "add_plane";
    }
    @Override
    public String getArgs() {
        return " 'type' 'name'";
    };
    @Override
    public void execute(List<String> arguments) {
        if (arguments.size() == 2) {
            aviacompany.addPlane(PlaneUtils.createPlane(arguments.get(0), arguments.get(1)));
            System.out.println("Plane added!");
        } else {
            System.out.println("Incorrect arguments!");
        }
    }
}
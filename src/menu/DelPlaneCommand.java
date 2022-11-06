package menu;

import aviacompany.Aviacompany;

import java.util.List;

public class DelPlaneCommand implements Command{
    private final Aviacompany aviacompany;

    public DelPlaneCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "delete_plane";
    }
    @Override
    public String getArgs() {
        return " 'name'";
    };
    @Override
    public void execute(List<String> arguments) {
        aviacompany.deletePlaneByName(arguments.get(0));
        System.out.println("Plane deleted from aviacompany!");
    }
}
package main.menu;

import main.aviacompany.Aviacompany;

import java.util.List;

public class FindPlaneCommand implements Command{
    private final Aviacompany aviacompany;

    public FindPlaneCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "find_plane";
    }

    @Override
    public String getArgs() {
        return " 'min' 'max'";
    };
    @Override
    public void execute(List<String> arguments) {
        aviacompany.findPlaneByFuelCons(Integer.parseInt(arguments.get(0)), Integer.parseInt(arguments.get(1)));
    }
}
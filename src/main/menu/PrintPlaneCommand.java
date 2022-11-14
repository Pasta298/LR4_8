package main.menu;

import main.aviacompany.Aviacompany;

import java.util.List;

public class PrintPlaneCommand implements Command{
    private final Aviacompany aviacompany;

    public PrintPlaneCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "print_plane";
    }
    @Override
    public String getArgs() {
        return " 'name'";
    };
    @Override
    public void execute(List<String> arguments) {
        aviacompany.printPlaneByName(arguments.get(0));
    }
}
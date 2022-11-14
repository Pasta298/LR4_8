package main.menu;

import java.util.List;

public class ExitCommand implements Command{
    public ExitCommand() {
    }

    @Override
    public String getKey() {
        return "exit";
    }

    @Override
    public void execute(List<String> arguments) {
        System.out.println("Exiting from program!");
        System.exit(0);
    }
}
package main.menu;

import main.utilities.LoggerUtils;

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
        LoggerUtils.logInfo(Menu.class, "Process finished");
        System.out.println("Exiting from program!");
        System.exit(0);
    }
}
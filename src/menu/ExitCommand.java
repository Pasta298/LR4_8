package menu;

import aviacompany.Aviacompany;

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
        System.out.println("Exited from program!");
        System.exit(0);
    }
}
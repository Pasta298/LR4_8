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
        System.out.println(" Команда виходу з програми виконалась! ");
        System.exit(0);
    }
}
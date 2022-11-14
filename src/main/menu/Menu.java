package main.menu;

import main.aviacompany.Aviacompany;

import java.util.*;

public class Menu {
    protected Map<String, Command> menuPoints;
    protected List<String> help;

    public Menu() {
        this.menuPoints = initMenu();
        this.help = initHelp();
    }

    private final Aviacompany aviacompany = new Aviacompany();

    public Map<String, Command> initMenu() {
        Map<String, Command> points = new HashMap<>();

        Command command = new AddPlaneCommand(aviacompany);
        points.put(command.getKey(), command);

        command = new DelPlaneCommand(aviacompany);
        points.put(command.getKey(), command);

        command = new PrintPlaneCommand(aviacompany);
        points.put(command.getKey(), command);

        command = new LoadAviaCompanyCommand(aviacompany);
        points.put(command.getKey(), command);

        command = new PrintAviaCompanyCommand(aviacompany);
        points.put(command.getKey(), command);

        command = new SaveAviaCompanyCommand(aviacompany);
        points.put(command.getKey(), command);

        command = new FindPlaneCommand(aviacompany);
        points.put(command.getKey(), command);

        command = new CalculateCapacityCommand(aviacompany);
        points.put(command.getKey(), command);

        command = new ExitCommand();
        points.put(command.getKey(), command);

        return points;
    }

    public List<String> initHelp() {
        List<String> args = new ArrayList<>();
        for (Map.Entry<String, Command> entry : menuPoints.entrySet()) {
            args.add(entry.getKey() + entry.getValue().getArgs());
        }
        return args;
    }

    public void execute(List<String> commandAndArgs) {
        String command = commandAndArgs.remove(0);
       if (menuPoints.containsKey(command)) {
           menuPoints.get(command).execute(commandAndArgs);
       } else if(command.equals("help")) {
           System.out.println(help);
       } else {
           System.out.println("Type another command!");
       }
    }
}
package menu;

import aviacompany.Aviacompany;

import java.util.*;

public class Menu {
    protected Map<String, Command> menuPoints;
    protected Collection<String> help;

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

    public Collection<String> initHelp() {
        Map<String, Command> points = initMenu();
        return points.keySet();
    }

    public void execute(List<String> command) {
       if (menuPoints.containsKey(command.get(0))) {
           menuPoints.get(command.get(0)).execute(command);
       } else if(command.get(0).equals("help")) {
           System.out.println(help);
       }
       else{
           System.out.println("Type another command!");
       }
    }
}
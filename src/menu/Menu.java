package menu;

import aviacompany.Aviacompany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Menu {
    protected HashMap<String, Command> menuPoints;
    protected List<String> help;

    public Menu() {
        this.menuPoints = initMenu();
        this.help = initHelp();
    }

    private final Aviacompany aviacompany = new Aviacompany();

    public HashMap<String, Command> initMenu() {
        HashMap<String, Command> points = new HashMap<>();

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
        List<String> points = new ArrayList<>();

        Command command = new AddPlaneCommand(aviacompany);
        points.add(command.getKey());

        command = new DelPlaneCommand(aviacompany);
        points.add(command.getKey());

        command = new PrintPlaneCommand(aviacompany);
        points.add(command.getKey());

        command = new LoadAviaCompanyCommand(aviacompany);
        points.add(command.getKey());

        command = new PrintAviaCompanyCommand(aviacompany);
        points.add(command.getKey());

        command = new SaveAviaCompanyCommand(aviacompany);
        points.add(command.getKey());

        command = new FindPlaneCommand(aviacompany);
        points.add(command.getKey());

        command = new CalculateCapacityCommand(aviacompany);
        points.add(command.getKey());

        command = new ExitCommand();
        points.add(command.getKey());

        return points;
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
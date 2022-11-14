package main.menu;

import main.aviacompany.Aviacompany;

import java.util.List;

public class CalculateCapacityCommand implements Command{
    private final Aviacompany aviacompany;

    public CalculateCapacityCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "calculate_capacity";
    }

    @Override
    public void execute(List<String> arguments) {
        aviacompany.calcCapacities();
    }
}
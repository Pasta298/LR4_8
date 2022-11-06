package menu;

import aviacompany.Aviacompany;

import java.util.List;

public class PrintAviaCompanyCommand implements Command{
    private final Aviacompany aviacompany;

    public PrintAviaCompanyCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "print_aviacompany";
    }
    @Override
    public void execute(List<String> arguments) {
        System.out.println("\t\t\tAviacompany planes:");
        aviacompany.printPlanes();
    }
}
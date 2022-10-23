package menu;

import aviacompany.Aviacompany;

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
    public void execute(List<String> arguments) {
        System.out.println(" Команда виведення літака виконалась! ");
    }
}

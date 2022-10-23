package menu;

import aviacompany.Aviacompany;

import java.util.List;

public class FindPlaneCommand implements Command{
    private final Aviacompany aviacompany;

    public FindPlaneCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "find_plane";
    }

    @Override
    public void execute(List<String> arguments) {
        System.out.println(" Команда виведення літака за діапазоном витрат палива виконалась! ");
    }
}
package menu;

import aviacompany.Aviacompany;

import java.util.List;

public class AddPlaneCommand implements Command{
    private final Aviacompany aviacompany;

    public AddPlaneCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "add_plane";
    }

    @Override
    public void execute(List<String> arguments) {
        System.out.println(" Команда додавання літака виконалась! ");
    }
}
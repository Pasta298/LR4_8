package menu;

import aviacompany.Aviacompany;

import java.util.List;

public class DelPlaneCommand implements Command{
    private final Aviacompany aviacompany;

    public DelPlaneCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "delete_plane";
    }

    @Override
    public void execute(List<String> arguments) {
        System.out.println(" Команда видалення літака виконалась! ");
    }
}
package menu;

import aviacompany.Aviacompany;

import java.util.List;

public class LoadAviaCompanyCommand implements Command{
    private final Aviacompany aviacompany;

    public LoadAviaCompanyCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "load_aviacompany";
    }

    @Override
    public void execute(List<String> arguments) {
        System.out.println(" Команда завантаження авіакомпанії виконалась! ");
    }
}
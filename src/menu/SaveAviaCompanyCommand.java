package menu;

import aviacompany.Aviacompany;

import java.util.List;

public class SaveAviaCompanyCommand implements Command{
    private final Aviacompany aviacompany;

    public SaveAviaCompanyCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "print_aviacompany";
    }

    @Override
    public void execute(List<String> arguments) {
        System.out.println(" Команда збереження авіакомпанії виконалась! ");
    }
}
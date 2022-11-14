package main.menu;

import main.aviacompany.Aviacompany;
import main.utilities.FileUtils;

import java.util.List;

public class SaveAviaCompanyCommand implements Command{
    private final Aviacompany aviacompany;

    public SaveAviaCompanyCommand(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }

    @Override
    public String getKey() {
        return "save_aviacompany";
    }
    @Override
    public String getArgs() {
        return " 'filename'";
    };
    @Override
    public void execute(List<String> arguments) {
        FileUtils.saveAviacompany(aviacompany, String.join(" ", arguments));
    }
}
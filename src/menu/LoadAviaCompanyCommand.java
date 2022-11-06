package menu;

import aviacompany.Aviacompany;
import utilities.FileUtils;

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
    public String getArgs() {
        return " 'filename'";
    };
    @Override
    public void execute(List<String> arguments) {
        aviacompany.copyAviaCompany(FileUtils.loadAviacompany(String.join(" ", arguments)));
    }
}
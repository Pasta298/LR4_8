package menu;

import java.util.List;

public interface Command {
    default String getArgs() {
        return " ";
    };
    String getKey();
    void execute(List<String> arguments);
}
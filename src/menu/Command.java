package menu;

import java.util.List;

public interface Command {
    String getKey();

    void execute(List<String> arguments);
}

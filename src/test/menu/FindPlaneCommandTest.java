package test.menu;

import main.menu.Menu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPlaneCommandTest {
    private final ByteArrayOutputStream outData = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void findPlaneCommandTest() {
        System.setOut(new PrintStream(outData));

        Menu menu = new Menu();
        menu.execute(new ArrayList<>(List.of("add_plane", "Mriya", "Eagle")));
        menu.execute(new ArrayList<>(List.of("find_plane", "20", "30")));
        menu.execute(new ArrayList<>(List.of("find_plane", "10", "20")));

        Assertions.assertTrue(outData.toString().contains("Fuel Consumption: 23"));
        Assertions.assertTrue(outData.toString().contains("There`s is no plane with this interval!"));

        Assertions.assertEquals(4, Arrays.asList(outData.toString().split("\n")).size());
        System.setOut(new PrintStream(originalOut));
    }
}

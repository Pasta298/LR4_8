package test.menu;

import main.menu.Menu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAviacompanyCommandTest {
    private final ByteArrayOutputStream outData = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void printAviacompanyCommandTest() {
        System.setOut(new PrintStream(outData));

        Menu menu = new Menu();
        menu.execute(new ArrayList<>(List.of("add_plane", "Some", "Eagle")));
        menu.execute(new ArrayList<>(List.of("print_aviacompany")));
        menu.execute(new ArrayList<>(List.of("delete_plane", "Eagle")));
        menu.execute(new ArrayList<>(List.of("print_aviacompany")));

        Assertions.assertTrue(outData.toString().contains("1) Plane: Eagle, Flight Distance: 2000"));
        Assertions.assertTrue(outData.toString().contains("This aviacompany have no planes!"));

        Assertions.assertEquals(7, Arrays.asList(outData.toString().split("\n")).size());
        System.setOut(new PrintStream(originalOut));
    }
}
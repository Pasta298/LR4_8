package test.menu;

import main.menu.Menu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class PrintPlaneCommandTest {
    private final ByteArrayOutputStream outData = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void printPlaneCommandTest() {
        System.setOut(new PrintStream(outData));

        Menu menu = new Menu();
        menu.execute(new ArrayList<>(List.of("add_plane", "Airbus", "Eagle")));
        menu.execute(new ArrayList<>(List.of("print_plane", "Eagle")));

        Assertions.assertEquals("Model: Airbus", outData.toString().split("\n")[3]);
        System.setOut(new PrintStream(originalOut));
    }
}
package test.menu;

import main.menu.Menu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CalculateCapacityCommandTest {
    private final ByteArrayOutputStream outData = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Test
    public void calculateCapacityCommandTest() {
        System.setOut(new PrintStream(outData));

        Menu menu = new Menu();
        menu.execute(new ArrayList<>(List.of("add_plane", "Douglas", "Eagle")));
        menu.execute(new ArrayList<>(List.of("add_plane", "Boeing", "Owl")));
        menu.execute(new ArrayList<>(List.of("calculate_capacity")));

        Assertions.assertEquals("Total Cargo Capacity: 92\r", outData.toString().split("\n")[2]);
        System.setOut(new PrintStream(originalOut));
    }
}
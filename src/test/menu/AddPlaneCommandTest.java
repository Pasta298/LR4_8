package test.menu;

import main.menu.Menu;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class AddPlaneCommandTest {
    private final ByteArrayOutputStream outData = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void addPlaneCommandTest() {
        System.setOut(new PrintStream(outData));

        Menu menu = new Menu();
        menu.execute(new ArrayList<>(List.of("add_plane", "Douglas", "Eagle")));
        Assertions.assertEquals("Plane added!\r", outData.toString().split("\n")[0]);

        System.setOut(new PrintStream(originalOut));
    }
}
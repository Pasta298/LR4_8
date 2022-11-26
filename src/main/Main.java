package main;

import main.menu.Menu;
import org.apache.log4j.PropertyConfigurator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        PropertyConfigurator.configure("log4j.properties");
        while(true) {
            System.out.println("\t\t\t\t\tMenu");
            System.out.println("Type command (For commands list type 'help'): ");
            List<String> command = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
            menu.execute(command);
        }
    }
}
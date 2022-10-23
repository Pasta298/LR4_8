import menu.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        while(true) {
            System.out.println("\t\t\t\t\tMenu");
            System.out.println("Type command (For commands list type 'help'): ");
            List<String> command = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
            menu.execute(command);
        }
    }
}
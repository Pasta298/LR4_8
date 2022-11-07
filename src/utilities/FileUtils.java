package utilities;

import aviacompany.Aviacompany;

import java.io.*;

public class FileUtils {
    public static void saveAviacompany(Aviacompany aviacompany, String filename) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(filename + ".txt")))) {
            objectOutputStream.writeObject(aviacompany);
            System.out.println("Aviacompany saved successfully!");
        } catch (IOException e) {
            System.out.println("Error while trying to save!");
        }
    }
    public static Aviacompany loadAviacompany(String filename) {
        Aviacompany aviacompany = new Aviacompany();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(filename + ".txt")))) {
            aviacompany = (Aviacompany) objectInputStream.readObject();
            System.out.println("Aviacompany loaded successfully!");
        } catch (Exception e) {
            System.out.println("Error while trying to load!");
        }
        return aviacompany;
    }
}
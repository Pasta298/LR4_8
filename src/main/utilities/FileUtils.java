package main.utilities;

import main.aviacompany.Aviacompany;

import java.io.*;

public class FileUtils {
    public static void saveAviacompany(Aviacompany aviacompany, String filename) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(filename + ".txt")))) {
            objectOutputStream.writeObject(aviacompany);
            System.out.println("Aviacompany saved successfully!");
        } catch (IOException e) {
            LoggerUtils.logFatal(e.getMessage());
            System.out.println("Error while trying to save!");
        }
    }
    public static Aviacompany loadAviacompany(String filename) {
        Aviacompany aviacompany = new Aviacompany();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(filename + ".txt")))) {
            aviacompany = (Aviacompany) objectInputStream.readObject();
            System.out.println("Aviacompany loaded successfully!");
        } catch (Exception e) {
            LoggerUtils.logFatal("Error while trying to load: " + e.getMessage());
            System.out.println("Error while trying to load!");
        }
        return aviacompany;
    }
}
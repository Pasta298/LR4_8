package utilities;

import aviacompany.Aviacompany;

import java.io.*;

public class FileUtils {
    public static void saveAviacompany(Aviacompany aviacompany, String filename) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(filename + ".txt"))) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(aviacompany);
            objectOutputStream.close();
            System.out.println("Aviacompany saved successfully!");
        } catch (IOException e) {
            System.out.println("Error while trying to save!");
        }
    }
    public static Aviacompany loadAviacompany(String filename) {
        Aviacompany aviacompany = new Aviacompany();
        try (FileInputStream fileInputStream = new FileInputStream(new File(filename + ".txt"))) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            aviacompany = (Aviacompany) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("Aviacompany loaded successfully!");
        } catch (Exception e) {
            System.out.println("Error while trying to load!");
        }
        return aviacompany;
    }
}
package lesson11.homework.file;

import java.io.*;

public class InputOutputUtil {
    public static void outputFile(File file, String text) {
        byte[] buffer;
        try (FileOutputStream fos = new FileOutputStream(file)) {
            buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static byte[] inputFile(File file) {
        byte[] buffer = new byte[0];
        try (FileInputStream fin = new FileInputStream(file)) {
            buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);
            return buffer;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return buffer;
    }

}

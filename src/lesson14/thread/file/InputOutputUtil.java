package lesson14.thread.file;

import java.io.*;

public class InputOutputUtil {
    public static synchronized void outputFile(File file, String text) {
        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            fos.write(text.getBytes(), 0, text.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static synchronized byte[] inputFile(File file) {
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

package lesson11.homework.blacklist;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public static List<String> linesInput(File file) {
        List<String> lines = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            int i = 0;
            while ((s = br.readLine()) != null) {
                lines.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return lines;
    }

}

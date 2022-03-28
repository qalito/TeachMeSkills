package lesson11.file.two;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {
    public static void writeIntoFiles(Path path, String content) {
        try {
            Files.write(path, content.getBytes(StandardCharsets.UTF_8));
            System.out.println("String " + content + " write into file:" + path.getFileName());
        } catch (IOException e) {
            System.out.println("Failed to write this text into file:" + path.getFileName());
        }
    }

    public static byte[] readFiles(Path path) {
        byte[] buffer = new byte[0];
        try {
            buffer=Files.readAllBytes(path);
            System.out.println("File read");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
}

package lesson11.file.two;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryCreator {
    public static void creteDir(Path path){
        try{
            Files.createDirectories(path);
            System.out.println("Directory is created!");
        }
        catch (IOException e){
            System.err.println("Failed to create directory!");
        }
    }
}

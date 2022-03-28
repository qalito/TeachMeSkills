package lesson11.homework.blacklist;

import java.io.File;
import java.io.IOException;

public class FileUtil {
    public File crateFile(String path) {
        File dir = new File(path);
        try {
            boolean created = dir.createNewFile();
            if (created)
                System.out.println("File has been created");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            crateFile(path);
        }
        return dir;
    }

    public void dirCrator(String path) {
        File dir = new File(path);
        boolean created = dir.mkdir();
        if (created) System.out.println("Folder has been created");
    }
}

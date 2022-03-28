package lesson11.file.two;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        DirectoryCreator.creteDir(Paths.get("D://SergDir"));
        String path ="D://SergDir/Serg.txt";
        String text="serg";
        FileUtil.writeIntoFiles(Paths.get(path), text);
        text=new String(FileUtil.readFiles(Paths.get(path)));
        System.out.println(text);
        text=text.replace("e","i");
        FileUtil.writeIntoFiles(Paths.get(path), text);
        text=new String(FileUtil.readFiles(Paths.get(path)));
        System.out.println(text);
    }
}

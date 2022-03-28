package lesson14.thread.file;

import java.io.File;
import java.util.Arrays;

public class SaveAsThread implements Runnable {
    private int[] array;
    private File file;

    public SaveAsThread(int[] array, File file) {
        this.array = array;
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        InputOutputUtil.outputFile(file, Arrays.toString(array) + "\n");
    }
}

package lesson14.thread.array;

public class ArrayUtil {
    private int[] array;

    public ArrayUtil(int[] array) {
        this.array = array;
    }

    public ArrayUtil() {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public synchronized int findMaxValue() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public synchronized int findMinValue() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

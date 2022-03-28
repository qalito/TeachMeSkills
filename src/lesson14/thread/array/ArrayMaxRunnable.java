package lesson14.thread.array;

public class ArrayMaxRunnable implements Runnable {
    private ArrayUtil array;
    private int value;

    public ArrayMaxRunnable(ArrayUtil array) {
        this.array = array;
    }

    public ArrayUtil getArray() {
        return array;
    }

    public void setArray(ArrayUtil array) {
        this.array = array;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        value=array.findMaxValue();
    }
}

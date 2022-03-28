package lesson14.thread.array;

public class ArrayMinRunnable implements Runnable {
    private ArrayUtil array;
    private int value;

    public ArrayMinRunnable(ArrayUtil array) {
        this.array = array;
    }

    public ArrayMinRunnable() {
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
        value=array.findMinValue();

    }
}

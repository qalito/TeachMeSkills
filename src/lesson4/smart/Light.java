package lesson4.smart;

public class Light {
    int number;
    int color;
    boolean on;

    void lightOn(boolean on) {
        this.on = on;
    }
    void onInfo() {
        System.out.println("Light  N"+number+" is on ="+on);
    }

    void allInfo() {
        System.out.println("Light N"+number+" is on ="+on+", color ="+color);
    }
}

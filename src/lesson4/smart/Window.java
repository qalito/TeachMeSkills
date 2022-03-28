package lesson4.smart;

public class Window {
    int number;
    double hight;
    double wight;
    boolean open;

    void openWindow(boolean open) {
        this.open=open;
    }
    void openInfo() {
        System.out.println("Window  N"+number+" is open ="+open);
    }
    void allInfo(){
        System.out.println("Window  N"+number+", h="+hight+", w="+wight+" is open ="+open);
    }
}

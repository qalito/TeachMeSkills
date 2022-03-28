package lesson4.smart;

public class Room {
    Window[] arrayWindow = new Window[3];

    void buildRoom() {
        for (int i = 0; i < arrayWindow.length; i++) {
            Window window = new Window();
            window.number = i + 1;
            window.hight = i * 2 + 1;
            window.wight = i + 4;
            arrayWindow[i] = window;
        }
        arrayWindow[0].openWindow(true);
        arrayWindow[2].openWindow(true);
    }

    void getInfoWindow() {
        for (int i = 0; i < arrayWindow.length; i++) {
            arrayWindow[i].allInfo();
        }
    }


}

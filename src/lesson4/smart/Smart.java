package lesson4.smart;

public class Smart {
    public static void main(String[] args) {
/*        Window window=new Window();
        window.hight=2.6;
        window.wight=3.2;
        window.number=1;
        window.openWindow(true);
        window.openInfo();
        window.allInfo();
        Light light = new Light();
        light.number=1;
        light.color=3;
        light.lightOn(true);
        light.onInfo();
        light.allInfo();*/
        Light light = new Light();
        light.number = 1;
        light.color = 3;
        light.lightOn(true);
        light.allInfo();
        Room room = new Room();
        room.buildRoom();
        room.getInfoWindow();
    }
}

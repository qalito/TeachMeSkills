package lesson4.builder;

public class Main {
    public static void main(String[] args) {
        Room r1 = new Room();
        Room r2 = new Room();
        Room r3 = new Room();
        Builder builder = new Builder();
        Room rrr = builder.build();
        rrr.h = 10;
        rrr.w = 77;
        builder.Run();
        rrr.showInf();
        Room room = builder.build();
        room.h = 11;
        room.w = 78;
        room.showInf();


    }
}

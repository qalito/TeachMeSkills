package lesson5.room;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write n");
        Table[] arrayTable = new Table[scanner.nextInt()];
        for (int i = 0; i < arrayTable.length; i++) {
            Table table = new Table();
            table.number = i + 1;
            table.hight = i * 2 + 1;
            table.wight = i + 4;
            table.color = i + 1;
            arrayTable[i] = table;
        }
        room.addArrayOfTable(arrayTable);
        room.getInfoTable();
    }
}

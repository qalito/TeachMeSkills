package lesson5.room;

public class Room {
    Table[] arrayTable;

    void getInfoTable() {
        for (int i = 0; i < arrayTable.length; i++) {
            arrayTable[i].allInfo();
        }
    }

    void addArrayOfTable(Table[] arrayTable) {
        this.arrayTable = arrayTable;
    }


}

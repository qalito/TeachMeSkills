package lesson16.task.lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create connection:");
        DataBase dataBaseSql = () -> "Sql";
        DataBase dataBaseOracle = () -> "Oracle";
        System.out.println(dataBaseOracle.connect());
        System.out.println(dataBaseSql.connect());
    }
}

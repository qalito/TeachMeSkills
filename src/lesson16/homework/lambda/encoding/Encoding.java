package lesson16.homework.lambda.encoding;
@FunctionalInterface
public interface Encoding {
    String set();
    static void print(){
        System.out.println("Set encoding please...");
    }
}

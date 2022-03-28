package lesson16.homework.lambda.encoding;

public class Main {
    public static void main(String[] args) {
        Encoding encodingUTF = () -> "UTF-8";
        Encoding encodingASCII = () -> "ASCII";
        System.out.println(encodingUTF.set());
        System.out.println(encodingASCII.set());
    }
}

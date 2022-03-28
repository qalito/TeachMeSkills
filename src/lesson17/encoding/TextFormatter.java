package lesson17.encoding;

public class TextFormatter {
    private String text;

    public TextFormatter(String text) {
        this.text = text;
    }

    public void encodingText(Encoding encoding){
        System.out.println("Encoding text:"+encoding.setEncoding(text));
    }
}

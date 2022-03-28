package lesson17.encoding;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Encoding encodingUTF = (text) -> new String(text.getBytes(StandardCharsets.UTF_8));
        Encoding encodingASCII = (text) -> new String(text.getBytes(StandardCharsets.US_ASCII));
        TextFormatter text = new TextFormatter("TextТекст132");
        text.encodingText(encodingUTF);
        text.encodingText(encodingASCII);
    }
}


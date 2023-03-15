package a;

import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanScanner extends BaseScanner<Boolean> {

    public BooleanScanner(InputStreamReader reader) {
        super(reader);
    }

    @Override
    public int nextByte() throws IOException {
        return reader.read();
    }

    @Override
    public Boolean read() throws IOException {
        StringBuilder builder = new StringBuilder();
        int nextByte;
        while ((nextByte = nextByte()) != -1 && !Character.isWhitespace(nextByte)) {
            builder.append((char) nextByte);
        }
        String str = builder.toString().toLowerCase();
        return str.equals("true") || str.equals("1");
    }
}
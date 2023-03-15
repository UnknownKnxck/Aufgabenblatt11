package a;

import java.io.IOException;
import java.io.InputStreamReader;

public class FloatScanner extends BaseScanner<Float> {
    public FloatScanner(InputStreamReader reader) {
        super(reader);
    }

    @Override
    public int nextByte() throws IOException {
        return reader.read();
    }

    @Override
    public Float read() throws IOException {
        float result = 0;
        StringBuilder builder = new StringBuilder();
        int nextByte;
        while ((nextByte = nextByte()) != -1 && !Character.isWhitespace(nextByte)) {
            builder.append((char) nextByte);
        }
        try {
            result = Float.parseFloat(builder.toString());
        } catch (NumberFormatException e) {
            System.out.println("Unexpected EOL.");
        }
        return result;
    }
}

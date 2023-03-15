package a;

import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleScanner extends BaseScanner<Double> {

    public DoubleScanner(InputStreamReader reader) {
        super(reader);
    }

    @Override
    public int nextByte() throws IOException {
        return reader.read();
    }

    @Override
    public Double read() throws IOException {
        double result = 0;
        StringBuilder builder = new StringBuilder();
        int nextByte;
        while ((nextByte = nextByte()) != -1 && !Character.isWhitespace(nextByte)) {
            builder.append((char) nextByte);
        }
        try {
            result = Double.parseDouble(builder.toString());
        } catch (NumberFormatException e) {
            System.out.println("Unexpected EOL.");
        }

        return result;
    }
}

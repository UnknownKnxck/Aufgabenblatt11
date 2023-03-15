package a;

import java.io.IOException;
import java.io.InputStreamReader;

public class IntScanner extends BaseScanner<Integer> {

    public IntScanner(InputStreamReader reader) {
        super(reader);
    }

    @Override
    public int nextByte() throws IOException {
        return reader.read();
    }

    @Override
    public Integer read() throws IOException {
        int result = 0;
        boolean negative = false;
        int nextByte;
        while ((nextByte = nextByte()) != -1 && !Character.isDigit(nextByte)) {
            if (nextByte == '-') {
                negative = true;
            }
        }
        if (nextByte == -1) {
            System.out.println("Unexpected EOL.");
        }
        do {
            result = result * 10 + Character.digit(nextByte, 10);
        } while ((nextByte = nextByte()) != -1 && Character.isDigit(nextByte));
        if (negative) {
            result = -result;
        }
        return result;
    }
}

package a;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringScanner extends BaseScanner<String> {
    public StringScanner(InputStreamReader reader) {
        super(reader);
    }

    @Override
    public int nextByte() throws IOException {
        return reader.read();
    }

    @Override
    public String read() throws IOException {
        List<Byte> bytes = new ArrayList<>();
        int nextByte = 0;
        while ((nextByte = nextByte()) != -1 && nextByte != 10) { //10 <-- NewLine
            bytes.add((byte) nextByte);
        }
        byte[] bytesArray = new byte[bytes.size()];
        for (int i = 0; i < bytes.size(); i++) {
            bytesArray[i] = bytes.get(i);
        }
        return new String(bytesArray);
    }
}

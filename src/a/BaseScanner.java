package a;

import java.io.IOException;
import java.io.InputStreamReader;

public abstract class BaseScanner<T> {
    protected final InputStreamReader reader;

    public BaseScanner(InputStreamReader reader) {
        this.reader = reader;
    }

    public abstract int nextByte() throws IOException;
    public abstract T read() throws IOException;
}
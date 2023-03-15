package a;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);

        // Test IntScanner
        System.out.println("IntScanner: ");
        IntScanner intScanner = new IntScanner(reader);
        System.out.println("Read int: " + intScanner.read());

        // Test DoubleScanner
        System.out.println("DoubleScanner: ");
        DoubleScanner doubleScanner = new DoubleScanner(reader);
        System.out.println("Read double: " + doubleScanner.read());

        // Test BooleanScanner
        System.out.println("BooleanScanner: ");
        BooleanScanner booleanScanner = new BooleanScanner(reader);
        System.out.println("Read boolean: " + booleanScanner.read());

        // Test StringScanner
        System.out.println("StringScanner: ");
        StringScanner stringScanner = new StringScanner(reader);
        System.out.println("Read string: " + stringScanner.read());

        //Test FloatScanner
        System.out.println("FloatScanner: ");
        FloatScanner floatScanner = new FloatScanner(reader);
        System.out.println("Read float: " + floatScanner.read());
    }
}
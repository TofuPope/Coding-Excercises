package poweekly;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static poweekly.June0622a.secondMax;

public class June0622aTests {
    private final InputStream stdin = System.in;
    private final PrintStream stdout = System.out;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        System.err.println("Running @Before");
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
    private String getOutput() {
        return testOut.toString();
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.err.println("Running @After");
        System.setIn(stdin);
        System.setOut(stdout);
    }

    @Test
    public void testCase1() {
        provideInput("3 1 2 3 10 15 5 100 999 500");
        June0622a.secondMax();
        assertEquals("2\n10\n500", getOutput());
    }

//    @Test
//    public void testCase2() {
//        provideInput("2 12 5 8 24 35 7");
//        secondMax();
//        assertEquals("8\n24", getOutput());
//    }
//
//    @Test
//    public void testCase3() {
//        final String sampleInput = "1 2 3 10";
//        provideInput(sampleInput);
//
//        secondMax();
//        assertEquals("3", getOutput());
//    }
}

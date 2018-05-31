package pw.jmct.placeholder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstSuite {

    @Test
    void testAdd() {
        Widget w = new Widget();
        int left = 1, right = 2;
        int sum = w.add(left, right);
        assertEquals(left + right, sum, "Incorrect result of Widget.add()");
    }

    @Test
    void testInc() {
        Widget w = new Widget();
        int base = 1;
        int result = w.inc(base);
        int expected = base + 1;
        assertEquals(expected, result, "Incorrect result of Widget.inc()");
    }

}

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {

    @Test
    public void shoudReturnTwoWhenOneAddOne() {
        Add adder = new Add();
        assertEquals(2, adder.addNumbers(1, 1));
    }

    @Test
    public void shoudReturn3WhenTwoAddOne() {
        Add adder = new Add();
        assertEquals(2, adder.addNumbers(1, 2));
    }
}
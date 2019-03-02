import fraction.FractionImpl;
import org.junit.Assert;
import org.junit.Test;

import static fraction.FractionImpl.isWholeNumber;
import static org.junit.Assert.*;

public class FractionImplTest {
    private final static String ONE = "1";

    @Test
    public void add() {
        fail();
    }

    @Test
    public void subtract() {
        fail();
    }

    @Test
    public void multiply() {
        fail();
    }

    @Test
    public void divide() {
        fail();
    }

    @Test
    public void abs() {
        fail();
    }

    @Test
    public void negate() {
        fail();
    }

    @Test
    public void testHashCode() {
        fail();
    }

    @Test
    public void testEquals() {
        fail();
    }

    @Test
    public void inverse() {
        fail();
    }

    @Test
    public void testToString() {
        Assert.assertEquals("1", new FractionImpl().toString());
    }

    @Test
    public void testIsWholeNumber() {
        FractionImpl myfrac = new FractionImpl(1);
        assertEquals(true, isWholeNumber("1") );
    }
}
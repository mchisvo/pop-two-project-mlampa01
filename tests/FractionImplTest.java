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

    @Test(expected = ArithmeticException.class)
    public void divisionByZero(){
        FractionImpl zeroFrac = new FractionImpl("1/0");
    }

    @Test
    public void testConstructorWithString(){
        assertEquals("3/4", new FractionImpl("3/4").toString());
        assertEquals("3/4", new FractionImpl("3/0").toString());

    }

    @Test
    public void testIsWholeNumber() {
        assertTrue(isWholeNumber("1"));
        assertTrue(isWholeNumber("-100"));
        assertFalse(isWholeNumber("1/2"));
        assertFalse(isWholeNumber("-1/2"));

    }
}
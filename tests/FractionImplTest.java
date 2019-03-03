import fraction.FractionImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionImplTest {
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

    @Test(expected = NumberFormatException.class)
    public void invalidInputTest(){
        FractionImpl invalidFrac = new FractionImpl("Abc@");
    }

    @Test
    public void testConstructorWithString(){
        assertEquals("3/4", new FractionImpl("3/4").toString());
        assertEquals("3/4", new FractionImpl("3/0").toString());
    }

    @Test
    public void testIsWholeNumber() {
        assertTrue(FractionImpl.isWholeNumber("1"));
        assertTrue(FractionImpl.isWholeNumber("-100"));
        assertFalse(FractionImpl.isWholeNumber("1/2"));
        assertFalse(FractionImpl.isWholeNumber("-1/2"));
    }

    @Test
    public void testGCD(){
       assertEquals(2, FractionImpl.gcd(2, 4));
       assertEquals(2, FractionImpl.gcd(44, 54));
       assertEquals(6, FractionImpl.gcd(30, 36));
       assertEquals(6, FractionImpl.gcd(-36, 30));


    }
}
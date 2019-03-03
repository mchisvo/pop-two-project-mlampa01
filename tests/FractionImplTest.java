import fraction.Fraction;
import fraction.FractionImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionImplTest {
    private final Fraction twoThirds = new FractionImpl(2,3);
    private final Fraction negativeTwoThirds = new FractionImpl(-2,3);
    private final Fraction oneFith = new FractionImpl(1,5);

    private final Fraction thirteenOverfifteen = new FractionImpl(13,15);
    private final Fraction negativeSevenOverFifteen = new FractionImpl(-7,15);
    private final Fraction sevenOverFifteen = new FractionImpl(7,15);
    private final Fraction negativeThirteenOverfifteen = new FractionImpl(-13,15);
    private final Fraction twoOverfifteen = new FractionImpl(2,15);
    private final Fraction negativeTwoOverfifteen = new FractionImpl(-2,15);

    @Test
    public void add() {
        assertEquals(thirteenOverfifteen, twoThirds.add(oneFith));
        assertEquals(negativeSevenOverFifteen, negativeTwoThirds.add(oneFith));
    }

    @Test
    public void subtract() {
        assertEquals(sevenOverFifteen, twoThirds.subtract(oneFith));
        assertEquals(negativeThirteenOverfifteen, negativeTwoThirds.subtract(oneFith));
    }

    @Test
    public void multiply() {
        assertEquals(twoOverfifteen, twoThirds.multiply(oneFith));
        assertEquals(negativeTwoOverfifteen, negativeTwoThirds.multiply(oneFith));

    }

    @Test
    public void divide() {
        assertEquals(new FractionImpl(10,3), twoThirds.divide(oneFith));
        assertEquals(new FractionImpl(-10,3), negativeTwoThirds.divide(oneFith));
    }

    @Test
    public void abs() {
        assertEquals(thirteenOverfifteen, negativeThirteenOverfifteen.abs());
    }

    @Test
    public void negate() {
        //TODO
        fail();
    }

    @Test
    public void testHashCode() {
        //TODO
        fail();
    }

    @Test
    public void testEquals() {
        //TODO
        fail();
    }

    @Test
    public void inverse() {
        //TODO
        fail();
    }

    @Test
    public void testCompareTo() {
        assertEquals(0, twoThirds.compareTo(twoThirds));
        assertTrue(oneFith.compareTo(twoThirds) < 1);
        assertTrue(twoThirds.compareTo(oneFith) > 1);

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
        //assertEquals("3/4", new FractionImpl("3/0").toString());
        assertEquals("3/4", new FractionImpl("6/8").toString());
        //make sure negative denominator is dealt with
        assertEquals("3/4", new FractionImpl("-6/-8").toString());
        assertEquals("-3/4", new FractionImpl("6/-8").toString());


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
       assertEquals(3, FractionImpl.gcd(3, 3));




    }
}
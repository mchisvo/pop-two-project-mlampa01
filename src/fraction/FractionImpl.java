package fraction;

public class FractionImpl implements Fraction {
    private int numerator;
    private int denominator;

    private int getNumerator() {
        return numerator;
    }

    private int getDenominator() {
        return denominator;
    }

    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     * <p>
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     *
     * @param numerator
     * @param denominator
     */
    public FractionImpl(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        this(wholeNumber, 1);
    }

    public FractionImpl() {
        this(1);
    }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) throws ArithmeticException, NumberFormatException {
        int numerator;
        int denominator;
        if (isWholeNumber(fraction)) {
            // If we are passed a whole number, set the numerator to whole number and denominator to 1
            try {
                Integer.parseInt(fraction);
            } catch (NumberFormatException nfe) {
                throw new NumberFormatException(fraction + " is not a number");
            }
            this.numerator = Integer.parseInt(fraction);
            this.denominator = 1;

        } else {
            // We need to split out the numerator and denominator
            // and check id denominator is zero, throw necessary exception.
            String[] parts = fraction.split("/");
            if (parts[1].equals("0")) {
                throw new ArithmeticException("Cannot divide by zero!");
            } else {
                numerator = Integer.parseInt(parts[0].trim());
                denominator = Integer.parseInt(parts[1].trim());
                // check if denominator is negative, negate both numerator and denominator
                if (denominator < 0) {
                    numerator *= -1;
                    denominator *= -1;
                }
                int greatestCommonDivisor = gcd(numerator, denominator);
                // reduce the numerator and denominator of the fraction
                numerator /= greatestCommonDivisor;
                denominator /= greatestCommonDivisor;
                this.numerator = numerator;
                this.denominator = denominator;
            }
        }
    }

    public static int gcd(int numerator, int denominator) {
        if (denominator == 0) {
            return Math.abs(numerator);
        }
        return gcd(denominator, numerator % denominator);  //divide a by the remainder of a/b
    }
    /**
     * Determine whether the number entered is a whole number
     *
     * @param string
     * @return
     */
    public static boolean isWholeNumber(String string) {
        //break String into String[]
        String[] parts = string.split("/");
        if (parts.length == 1) {
            return true;
        }
        return false;
    }
    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        FractionImpl operand = new FractionImpl(f.toString()); // create a new fractionimpl object from the one passed to us
        int num = (operand.getNumerator() * getDenominator()) + (getNumerator() * operand.getDenominator());
        int den = getDenominator() * operand.getDenominator();
        return new FractionImpl(num, den);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        return add(f.negate());
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        FractionImpl operand = new FractionImpl(f.toString());
        int a = operand.getNumerator();
        int b = operand.getDenominator();
        int c = getNumerator();
        int d = getDenominator();
        return new FractionImpl((a * c), (b * d));
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        FractionImpl operand = new FractionImpl(f.toString());
        return this.multiply(operand.inverse());
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        if (this.numerator < 0) return new FractionImpl(getNumerator() * -1, getDenominator());
        return this;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        return new FractionImpl(-1 * getNumerator(), getDenominator());
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fraction)) return false;
        FractionImpl f = new FractionImpl(obj.toString());
        return getNumerator() == f.getNumerator() &&
                getDenominator() == f.getDenominator();
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() {
        return new FractionImpl(getDenominator(), getNumerator());
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        //  Found here https://introcs.cs.princeton.edu/java/92symbolic/Rational.java.html
        FractionImpl operand = new FractionImpl(o.toString());
        int lhs = getNumerator() * operand.getDenominator();
        int rhs = getDenominator() * operand.getNumerator();
        if (lhs < rhs) return -1;
        if (lhs > rhs) return +1;
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        return (getDenominator() == 1) ?
                "" + getNumerator() : (getNumerator() + "/" + getDenominator());
    }

}
package fraction;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //TODO getting stated
        Fraction twoThirds = new FractionImpl(2,3);
        Fraction twoThirds2 = new FractionImpl(2,3);
        Fraction thretwos = new FractionImpl(3,2);

        System.out.println(twoThirds + " " + twoThirds.hashCode());
        System.out.println(twoThirds2 + " " + twoThirds2.hashCode());
        System.out.println(thretwos + " " + thretwos.hashCode());


    }
}

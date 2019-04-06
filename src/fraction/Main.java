package fraction;

public class Main {

    public static void main(String[] args) {
        // Example implementations. FractionImplTest is more robust
        Fraction twoThirds = new FractionImpl(2, 3);
        Fraction twoThirds2 = new FractionImpl(2, 3);
        Fraction thretwos = new FractionImpl(3, 2);

        System.out.println(twoThirds + " " + twoThirds.hashCode());
        System.out.println(twoThirds2 + " " + twoThirds2.hashCode());
        System.out.println(thretwos + " " + thretwos.hashCode());

        System.out.println(twoThirds + " " + twoThirds.toString().hashCode());
        try {
            System.out.println(twoThirds2 + " " + ((FractionImpl) twoThirds2).clone().hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

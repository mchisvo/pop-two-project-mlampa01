# pop-two-project-mlampa01
Coursework popii

Coursework Two — A Fraction API
Principles of Programming II Part-time cohort 2018
Java provides several types of numbers, but it does not provide fractions.
Your task is to implement a Fraction API (Application Programmer’s Interface) and write a small program that uses it.
Purpose of this assignment
• To give you practice with creating classes.
• To give you practice reading the API.
• To give you more practice with string manipulation. • To give you practice creating Javadoc files.
Sample code
Can be found on the module repository under the coursework-two folder; it is an IntelliJ project. General idea of the assignment
• Implement the Fraction API (see interface Fraction)
• Write very thorough JUnit tests.
Create a package named fraction. Your classes, Fraction, FractionImpl, and FractionTest, will all be within this package (though in different parts of the project).
Note: The Fraction class has a lot of methods, but they are all pretty short.
The API
We now list some information about your the Fraction type. The sample code lists the constructors and other methods that you are required to provide. (Note that Java does not allow constructors to be specified in an interface, hence the use of FractionImpl).
Instance variables in FractionImpl
Two private integers, known as the numerator and the denominator. Do not provide public accessors or mutators (getters or setters) for these instance variables; there is no reason for anything outside the FractionImpl class to know about them.
Note: Even though these instance variables are private, they are private to the class, not to the object. This means that any Fraction object can access the private variables of any other Fraction object; it’s only outside this class that you cannot access them.
How written
n/d, where n is the numerator and d is the denominator. 1
Restrictions
The denominator may not be zero.
Normalisation
• The fraction is always kept in the lowest terms, that is, the Greatest Common Divisor (GCD) of n and d is 1 (use Euclid’s algorithm).
• The denominator is never negative. (You can give a negative number for the denominator to the construc- tor when you create the fraction, but a negative fraction should be represented internally with a negative numerator.)
• Zero should be represented as 0/1.
To put a fraction into its lowest terms, divide both the numerator and the denominator by their Greatest Common
Divisor (GCD); Euclid’s algorithm finds the GCD of two integers. It works as follows:
• As long as the two numbers are not equal, replace the larger number with the remainder of dividing the larger
by the smaller (that is, larger = larger % smaller).
• When the two numbers are equal, that value is the GCD.
(If this brief explanation isn’t enough, look up Euclid’s algorithm on the Web.)

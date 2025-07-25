import java.util.Scanner;

public class FractionArRay {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                // Input first fraction
                System.out.print("Enter numerator and denominator of Fraction 1: ");
                int num1 = input.nextInt();
                int den1 = input.nextInt();
                Fraction f1 = new Fraction(num1, den1);

                // Input second fraction
                System.out.print("Enter numerator and denominator of Fraction 2: ");
                int num2 = input.nextInt();
                int den2 = input.nextInt();
                Fraction f2 = new Fraction(num2, den2);

                // Perform operations
                Fraction add = f1.add(f2);
                Fraction sub = f1.subtract(f2);
                Fraction mul = f1.multiply(f2);
                Fraction div = f1.divide(f2);

                // Output results
                System.out.println("\nFraction 1: " + f1);
                System.out.println("Fraction 2: " + f2);
                System.out.println("Addition: " + add);
                System.out.println("Subtraction: " + sub);
                System.out.println("Multiplication: " + mul);
                System.out.println("Division: " + div);
        }
}
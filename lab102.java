import java.util.Scanner;

public class lab102 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("============");
        System.out.println("Welcome to our program!");
        System.out.println("'Quatratic Equation Solver ax^2 + bx + c = 0'");
        System.out.print("Enter a:");
        double a = s.nextDouble();
        System.out.print("Enter b:");    
        double b = s.nextDouble();
        System.out.print("Enter c:");
        double c = s.nextDouble();
        System.out.println("============");
        System.out.println("Root of the equation: " + a + "x^2 + " + b + "x + " + c + " = 0");
        double D = b*b - 4*a*c;
        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2*a);
            double root2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (D == 0) {
            double root = -b / (2*a);
            System.out.println("Roots are real and the same.");
            System.out.println("Root: " + root);
        } else {
            System.out.println("Roots are complex and different.");
            double realPart = -b / (2*a);
            double imaginaryPart = Math.sqrt(-D) / (2*a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        s.close();

    }
}

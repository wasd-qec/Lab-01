
import java.util.Scanner;

public class lab105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n=0;
        boolean f = false;
        while (f==false){
        boolean g = false;
        while (g != true) {
            g = scanner.hasNextInt();
            if (g == false){
            System.out.println("'" + scanner.next() + "' is not an integer. Try again.");
            System.out.print("Input n: ");
            }
            else {
                break;
            }
        }
        n = scanner.nextInt();
        if (n<2){
            System.out.println("Input must be greater than 1. Try again.");
            System.out.print("Input n: ");
            f = false;
        }
        else
        {break;}
    }
        System.out.println("You entered: " + n);
        for ( int i =2; i<=n; i++){
            if (isPrime(i)){
                System.out.print(i + " is prime\n");
            }
        }
        scanner.close();
    }
    public static boolean isPrime(int n) {
        // Check for divisibility from 2 up to the square root of n
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }
        return true; // No divisors found, so it's prime
    }
}

import java.util.Scanner;

public class lab101{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum = 0;
        double average = 0.00;
        int n = s.nextInt();
        if (n >= 1000) {
            for (int i = 1000; i <= n; i++) {
                System.out.print(i + " ");
            }
            sum = (1000 + n) * (n - 1000 + 1 ) /2;
            average = (float) sum / (n - 1000 + 1);
        } else if (n < 1000) {
            for (int i = 1000; i >= n; i--) {
                System.out.print(i + " ");
            }
            sum = (1000 + n) * (1000 - n + 1 ) /2;
            average = (float) sum / (1000 - n + 1);
        }
        System.out.println("\nThe sum is: " + sum);
        System.out.println("The average is: " + average);
        s.close();
    }
}

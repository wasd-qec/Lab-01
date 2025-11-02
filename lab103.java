// ...existing code...
import java.util.Scanner;
public class lab103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five integers: ");
        int i = 0, numb[] = new int[5];
        while (i < 5) {
            System.out.print("Number " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                numb[i] = scanner.nextInt();
                i++;
            } else {
                String bad = scanner.next(); // consume invalid token (word or float)
                System.out.println("'" + bad + "' is not an integer. Please enter an integer.");
            }
        }
        int min = numb[0];
        for (int j = 0; j < 5; j++) {
            if (numb[j] < min) {
                min = numb[j];
            }
        }
        int max = numb[0];
        for (int j = 0; j < 5; j++) {
            if (numb[j] > max) {
                max = numb[j];
            }
        }
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);
        scanner.close();
    }
}
// ...existing code...

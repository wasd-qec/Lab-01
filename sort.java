import java.util.Scanner;
public class sort {
    Scanner scanner = new Scanner(System.in);
    int n[] = new int[5];
    public void inputNumbers() {
        System.out.println("Enter five integers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            n[i] = scanner.nextInt();
        }
    }
    public void sortNumbers() {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
    } 

}

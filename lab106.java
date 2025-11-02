import java.util.Scanner;
public class lab106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scores[] = new int[4];
        boolean valid = false;
        while(valid == false){
        System.out.print("Input your scores of 4 subjects:(Math, English, Physics and Programming)");
        for (int i=0; i<4; i++){
        scores[i] = scanner.nextInt();
        if (scores[i]<0 || scores[i]>100){
            System.out.println("Invalid input. Scores must be between 0 and 100. Try again.");
            valid = false;
            break;
        }
        else {
            valid = true;
        }
    }
    }
    int max=scores[0],min=scores[0];
    double avg=(scores[0]+scores[1]+scores[2]+scores[3])/4.0;
    for (int i=1; i<4; i++){
        if (scores[i]>max){
            max=scores[i];
        }
        if (scores[i]<min){
            min=scores[i];
        }
    }
    System.out.println("Highest score: " + max);
    System.out.println("Lowest score: " + min);
    System.out.print("Average score: %" + avg);
    scanner.close() ;
} 
}

import java.util.Scanner;

public class lab104 {
  

    public static boolean is_Valid_Date(String date)
    {
        int year = 0, month = 0, day = 0;

        try(Scanner scanner= new java.util.Scanner(date).useDelimiter("-"))
        {
            year = scanner.nextInt();
            month = scanner.nextInt();
            day = scanner.nextInt();
        }
        if(year < 0)
        {
            return false;
        }
        switch(month)
        {
            case 1, 3, 5, 7, 8, 9, 11: return (day >= 1 && day <= 31);
            case 4, 6, 10, 12: return (day >= 1 && day <= 31);
            case 2:
            {
                boolean leap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
                {
                    return (day >= 1 && day <= (leap ? 29 : 28));
                }
            }
            default: return false;
        }
    }
    public static void main(String[] args)
    {
        String date;
        System.out.println("Input a date (YYYY-MM-DD): ");
        try(java.util.Scanner scanner = new java.util.Scanner(System.in))
        {
            date = scanner.nextLine();
        }
        if (is_Valid_Date(date))
        {
           System.out.println("Output: Valid."); 
        }
        else
        {
            System.out.println("Output: Invalid.");
        }
    }
}
    


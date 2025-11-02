public class test1{
    public static void main(String[] args) {
        System.out.println("Welcome to class.");
        int ID = 20240038;
        String name = "Rith Chankolboth";
        String phone = "017859707";

        System.out.println("ID: " + ID + "\nName: " + name + "\nPhone: " + phone);

        for(int i=10; i<=100; i+=1){
            if (i == 50 || i == 60){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
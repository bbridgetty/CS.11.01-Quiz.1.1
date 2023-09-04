import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String favouriteFood;
        System.out.println("Please Enter Your Age:");
        int age  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please Enter Your Name:");
        firstName = scanner.nextLine();
        System.out.println("Please Enter Your Favourite Food");
        favouriteFood = scanner.nextLine();
        System.out.println("Name:"+firstName);
        System.out.println("Age:"+age);
        System.out.println("Favourite Food:"+favouriteFood);




    }
}

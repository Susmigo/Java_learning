import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //getting data from user

        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Enter your Branch of study:");
        String branch = sc.next();

        System.out.println("Enter your year of passing:");
        int yop = sc.nextInt();

        //printing the user enterred information

        System.out.println("Your name is :"+name);
        System.out.println("Your age is :"+age);
        System.out.println("Your branch is :"+branch);
        System.out.println("Your year of passing is :"+yop);



    }
}

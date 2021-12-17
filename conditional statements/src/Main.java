import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Holah... You are eligible for license!!!");

        }
        else if(16<=age){
            System.out.println("you are eligible for learner license!!!");

        }
        else {
            System.out.println("Awww....You are not eligible for license!!!");

        }
    }
}
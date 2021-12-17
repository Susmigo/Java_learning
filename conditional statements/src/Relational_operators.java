import java.util.Scanner;

public class Relational_operators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if(num == 10){
            System.out.println("number is equal to 10");
        }  if (num !=10){
            System.out.println("number is not equal to 10");
        }  if (num>10){
            System.out.println("number is greater than 10");

        }  if (num<10){
            System.out.println("number is less than 10");
        }  if (num>=10){
            System.out.println("number is greater than or equal to 10");
        }  if (num<=10){
            System.out.println("number is less than or equal to 10");
        }

        }
    }


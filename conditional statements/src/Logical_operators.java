import java.util.Scanner;

public class Logical_operators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the percentage:");
        double percentage = sc.nextDouble();
/*
        if (age>=16 && percentage>70){
            System.out.println("you are Qualified");
        }else{
            System.out.println("you are disqualified");
        }

 */
        if (age>=16 || percentage>70){
            System.out.println("you are Qualified");
        }else{
            System.out.println("you are disqualified");
        }



    }
}

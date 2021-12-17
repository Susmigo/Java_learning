import java.util.Scanner;
public class Nested_if {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the percentage:");
        double percentage = sc.nextDouble();

        if (age>18){
            if (percentage>70){
                System.out.println("Age and percentage meet criteria");
            }else{
                System.out.println("you are above 18 and but your percentage <70");
            }

            }else{
            System.out.println("Doesn't meet our criteria!!!");
        }



    }
}

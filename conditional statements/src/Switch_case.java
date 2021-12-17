import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int Number = sc.nextInt();

        switch (Number){
            case 1: System.out.println("Number is :"+Number);break;
            case 2: System.out.println("Number is :"+Number);break;
            case 3: System.out.println("Number is :"+Number);break;
            case 4: System.out.println("Number is :"+Number);break;
            case 5: System.out.println("Number is :"+Number);break;
            default: System.out.println("Number is out of range");break;

        }

    }

}

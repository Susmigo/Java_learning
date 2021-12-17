import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variable initialization
	    float p;
        float t;
        float r;
        //object creation

        Scanner sc = new Scanner(System.in);

        // Reading input from the user
        System.out.println("Enter the principle amount: ");
        p = sc.nextFloat();
        System.out.println("Enter the years:");
        t = sc.nextFloat();
        System.out.println("Enter the rate of interest:");
        r = sc.nextFloat();

        //result
        double result = (p*t*r)/100;
        System.out.println("Simple interest is :"+result);

    }
}

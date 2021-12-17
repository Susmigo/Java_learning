import java.util.Scanner;
public class Simple_intrest_calculator {
	public static void main(String[] args) {
		double principle_amount,time,rateofintrest;
		double result;
		
		Scanner sc = new Scanner(System.in); //scanner object created
		
		System.out.println("Enter the principle amount:");
		principle_amount = sc.nextFloat();
		
		System.out.println("Enter the time:");
		time =sc.nextFloat();
		
		System.out.println("Enter the Rate of intrest:");
		rateofintrest = sc.nextFloat();
		
		result = (principle_amount*time*rateofintrest)/100;
		
		System.out.println("simple intrest is :"+result);
		
		
		
		
	}

}

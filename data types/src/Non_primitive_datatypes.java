
public class Non_primitive_datatypes {
	
	public static void main(String[] args) {
		
		//array 
		
		int arr[] = {10,20,30};
		System.out.println(arr[2]);
		arr[2]=100; // array elements accessing and re writing
		System.out.println(arr[2]);	
		
		//int  array declaration
		
		int score[];
		// array memory allocation
		score = new int[5];
		score[0]=100;
		
		System.out.println(score[0]);
		
		//float array
		
		double ar[] = {78.5,68.5,72.3};
		//float gives error
		System.out.println(ar[0]);
	}
}

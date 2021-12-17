import java.util.Scanner;

public class Tables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i = 1;
        int table = sc.nextInt();
        /*


        for( i=1;i<=10;i++){

            System.out.println(table+"X"+i+"="+(table*i));
        }

         */
/*
        while (i<10){ // using while loop
            System.out.println(table+"X"+i+"="+(table*i));
            i++;

        }

 */

        do{
            System.out.println(table+"X"+i+"="+(table*i));
            i++;
        }while(i<=10);

    }
}

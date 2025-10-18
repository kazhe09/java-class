
import java.util.Scanner;

class Main {
    public static void main(String args[]){
		Scanner input = new Scanner( System.in);
      
		System.out.println(" Enter the total numbers ; ");
		int num = input.nextInt(); 

        int sum = 0; 
        
		for ( int i = 1; i<= num; i++ ) {
			System.out.print(" Enter num" + i + " :- ");
			int num1 = input.nextInt ();
			sum += num1;
		}
        System.out.println(" Total sum:" + sum );
	}
}
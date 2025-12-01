import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    while(true){
        System.out.println(" Enter the starting number:- ");
        int num1 = input.nextInt(); 

        System.out.println(" Enter the ending number:- ");
        int num2 = input.nextInt(); 

        System.out.println(" 1.  Addition ");
        System.out.println (" 2. Subtraction ");
        System.out.println (" 3. Multiplication ");
        System.out.println(" 4. Division ");
        System.out.println( " Enter  your choice :- ");
        int choice = input.nextInt ();

        if ( choice == 1){
            System.out.println("Answer :- " + (num1 + num2 ));
        } else if ( choice == 2) {
            System.out.println(" Answer :-" + (num1 - num2 ));
        } else if ( choice == 3) {
            System.out.println("Answer :- " + (num1 * num2 ));
        } else if ( choice == 4) {
            if ( num2 != 0 ){
                System.out.println(" Answer :- " + (num1 / num2 ));
            } else {
                System.out.println(" Cann't divide by zero ." );
            }
        } else {
            System.out.println( " Invalid choice.");
        }

        System.out.println(" Do you want to continue (y/n) ? ");
        input.nextLine();
        String Ans = input.nextLine();
        if ( Ans == ("n")) {
            break; 
        }
    }
  }
}
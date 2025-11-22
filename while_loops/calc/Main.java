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
        System.out.println( " Enter  your choice :- ");
        int choice = input.nextInt ();

        if ( choice == 1){
            System.out.println("Answer :- " + (num1 + num2 ));
        } else if ( choice == 2) {
            System.out.println(" Answer :-" + (num1 - num2 ));
        } else {
            System.out.println( " Invalid choice.");
        }

        System.out.println(" Do you want to continue (y/n) ? ");
        String Ans = input.nextLine();
        if ( Ans == ("n")) {
            break; 
        }
    }
  }
}
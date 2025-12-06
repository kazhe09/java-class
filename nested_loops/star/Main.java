import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    System.out.println("Enter number of rows :- ");
    int rows = input.nextInt();

    System.out.println("Enter number of columns :- ");
    int columns = input.nextInt();
    
    for(int i = 0; i < rows; i++){

        for( int n = 0; n < columns; n++ ){
            System.out.print("*");
        }
        System.out.println();
    }

  }
}
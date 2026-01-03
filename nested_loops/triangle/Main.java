import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    int totalrows = 5;

    for ( int x = 1; x <= totalrows; x++ ) {
        for( int y =1 ; y <= totalrows; y++){
            System.out.print("*");
        }
        System.out.println();
    }

  }
}

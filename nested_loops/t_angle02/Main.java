import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    for(int i = 1; i <= 5; i++){
        for ( int n = 5; n >= i ; n--)
            System.out.println("*");
    }
    System.out.println();
  }
}
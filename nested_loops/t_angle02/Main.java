import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    int total = 5;

    for(int row = 0; row < total; row++){
      int space = row;
      int stars = total - row;

      for ( int s = 0; s < space; s++){
        System.out.print(" ");
      }
      for (int c = 0; c < stars; c++){
        System.out.print("*");
      }
       System.out.println();

    }
  }
}
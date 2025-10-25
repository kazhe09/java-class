import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    System.out.println(" Enter a number:-");
    int num =input.nextInt(); 

    int i = 0;

    while (i < num ) {
      System.out.println ("Num" + i);
      i++;
    }
    System.out.println("Outside the while loop");
  }
}   
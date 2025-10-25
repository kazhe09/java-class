import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    System.out.println(" Enter the starting number:-");
    int num1 =input.nextInt(); 

    System.out.println(" Enter the ending number:-");
    int num2 =input.nextInt(); 

    int i = num1;

    while( i <= num2) {
        System.out.println(i);
        i++;
    }
    System.out.println("Outside the while loop");
  }
}

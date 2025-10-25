import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    System.out.println(" Enter the starting number:-");
    int num1 =input.nextInt(); 

    System.out.println(" Enter the ending number:-");
    int num2 =input.nextInt(); 

    System.out.println(" Enter the number how much you want to increase:-");
    int num3 =input.nextInt();

    int i = num1;

    while (i <= num2 ){
        System.out.println(i);
        i+=num3;
    }
    System.out.println("Outside the while loop");
  }
}
import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);
    System.out.println("Enter the number :- ");
    int num = input.nextInt();

    int sum = 0;

    while (num > 0){
        int lastdigit = num % 10;
        sum = sum + lastdigit;
        num = num / 10;
    }
    System.out.println(" The sum of digit:-"  + sum);
  }
}
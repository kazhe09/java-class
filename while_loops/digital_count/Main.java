import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);
    
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    int digit_count = 0;

    int num2 =num;

    while (num > 0 ){
        digit_count += 1;
        num = num/10;
    }
    System.out.println("The number " + num2 + " has" + digit_count+ " digits");
  }
}

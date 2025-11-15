import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    System.out.println(" Enter the number:-");
    int num =input.nextInt(); 
    
    int org = num;
    int rev = 0;
     
    while (num > 0  ){
        int digit = num % 10;
        rev = rev * 10 + digit;
        num = num / 10;
    }
    System.out.println(" Reversed number :- " + rev);
    
    if (rev == org ){
      System.out.println("It's a palindrome.");
    } else{
      System.out.println("It's not a palindrome.");
    }
  }
}
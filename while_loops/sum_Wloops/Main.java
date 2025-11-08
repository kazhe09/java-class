import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);
     
    System.out.println(" Enter the starting number:-");
    int num =input.nextInt(); 

    while (num > 0) {
      int last  = num % 10;
      System.out.println(  "last digital:- " + last );

      num = num/ 10 ;
      System.out.println( "Remaining num:- " + num);
       
    }
  }
}

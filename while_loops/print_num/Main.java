import java.util.Scanner;

class Main {
    public static void main(String args[]){
		Scanner input = new Scanner( System.in);
      int i = 0;
      while(i < 5){
        System.out.println("Number :" + i);
        i++;
      }
      System.out.println("Outside the while loop");
   }
}
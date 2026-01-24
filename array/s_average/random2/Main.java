
import java.util.Random;
import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    int [] numbers = new int[5];
    Random r = new Random();

    for (int i = 0; i < numbers.length ; i++ ){
        numbers[i] = r.nextInt(10);
    }

    System.out.println(" Numbers of element :- ");
    for (int i = 0; i < numbers. length; i++){
        System.out.println(numbers[i]);
    }



    

    }

    
}

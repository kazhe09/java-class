import java.until.Scanner;
import java.until.Random;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    Random r = new Random();
    System.out.println("Random number: " + r.nextInt(10));

    int marks[] = new int [3];
    System.out.println("Length of array: " + marks.length);

    marks[0] = 85;
    marks[1] = 90;
    marks[2] = 70;

    for (int i = 0; i < marks.length; i++){
        System.out.println("Marks of subject " + (i+1) + " = "  + marks[i]);
    }

  }

}

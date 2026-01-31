import java.util.Scanner;
import java.util.Random;

class Main{
  public static void main(String args[]) {
        Scanner input = new Scanner ( System.in);

        int [] numbers = new int[5];
        Random r = new Random();
        int i = 0;

        while (i < 5){
            int num = r.nextInt(51);

            if ( num % 2 == 0){
                numbers[i] = num;
                i++;
            }
        }

        for (int j = 0; j < numbers. length; j++){
            System.out.println(numbers[j]);
        }
    }
}



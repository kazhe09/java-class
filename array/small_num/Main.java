import java.util.Scanner;

class Main{
  public static void main(String args[]) {
        Scanner input = new Scanner ( System.in);

        int [] numbers ={29,3,1,18,16,30};
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length ; i++ ) {
            if ( numbers [i] < smallest ){
                smallest = numbers[i];
            }
        }

        System.err.println("Smallest number:- " + smallest);
    }
}


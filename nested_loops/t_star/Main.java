import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    for(int i = 0; i <= 5 ; i++ ){

        for (int n = 0; n < i ; n++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
}

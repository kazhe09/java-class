import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    for(int i = 5; i > 0; i--){
    
    for (int n = 0; n < i ; n++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
}
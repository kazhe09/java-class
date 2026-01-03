// ******
// ****
// ***
// **
// *

import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    int totalrows = 5;

    for(int i = 0; i < totalrows; i++){
        int num_star = totalrows - i;

        for (int x = 0; x < num_star; x++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
}
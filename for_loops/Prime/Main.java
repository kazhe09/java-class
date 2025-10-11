import java.util.Scanner;

class Main{
     public static void main(String args[]) {
        Scanner input = new Scanner ( System.in);
           
        System.out.println(" Enter a number:-");
        int num =input.nextInt();

        int x = 0;

        for (int i = 1; i <= num; i++){
            if (num % i == 0) {
                x++;
            }
        }

        if ( x == 2) {
            System.out.println(num + "is a prime number.");  
        } else {
            System.out.println(num + "isn't a prime number.");   
        }
        
   }
}

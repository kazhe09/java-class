import java.util.Scanner;

class Main{
     public static void main(String args[]) {
        Scanner input = new Scanner ( System.in);

        System.out.println(" Enter a number:-");
        int num =input.nextInt();

        System.out.println(" The factors of " + num +" are :-");

        for(int i = 1; i <= num; i++){
            if (num % i == 0 ) {
                System.out.println(i);
            
            }
        }
        
     }
}
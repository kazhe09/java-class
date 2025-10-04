import java.util.Scanner;

class Main {
    public static void main(String args[]){
		Scanner input = new Scanner( System.in);
       
        System.out.println("Enter the number of subject :-");
        int sub = input.nextInt();

        int total = 0;

        for ( int i = 1; i <= sub ; i++ ){
            System.out.println( " Enter the mark for subject " + i + " :-");
            int marks = input.nextInt();
            total += marks;
        }
        System.out.println(" Total marks =" + total );
         
        double average = total/ sub ;
        
        System.out.println("Average mark :- " + average);
   
    }
}
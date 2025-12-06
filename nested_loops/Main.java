import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);
    int grandtotal = 0;

    for(int student = 0; student < 5; student ++){
        System.out.println("Taking the marks form student:- " + student + 1);
        int sum = 0;
        for (int subject = 0; subject < 3; subject++ ){
            System.out.println("Enter thr mark for subject:- " + subject + 1 + ":-");
            int marks = input.nextInt();
            sum += marks;
        }
        grandtotal += sum;
    }
     
    System.out.println("Grand total is:-" + grandtotal);
    
   }
 } 

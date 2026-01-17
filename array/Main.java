import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);
    
    int marks [ ] = {89,90,75,66,50,99,80};

    for (int i = 0; i < marks.length; i++){

         if (marks[i] % 2 == 0){
            System.out.println("Element at index " + i + " is " + marks[i]  + " and it's Even");
        
        }else {
            System.out.println("Element at index " + i + " is " + marks[i]  + " and it's Odd");
        }

            
        }

    }
}




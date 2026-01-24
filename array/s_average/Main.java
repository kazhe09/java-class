import java.util.Scanner;

class Main{
    public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);
    
    int marks [ ] = {89,90,75,66,50,99,80};

    int sum = 0;
    for (int i = 0; i < marks.length; i++){
        sum = sum + marks[i];
    }

    int average = sum/ marks.length;

    System.out.println("Average marks of the class :-" + average);
  }
}


import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner ( System.in);

    System.out.println("Enter number of student:-");
    int num_students =  input.nextInt();

    for(int i = 1; i <= num_students; i ++) {
        System.out.println( " Enter number of subjects for student " + i + " :-");
        int num_subjects = input.nextInt();
        
        int totalMarks = 0;

        for ( int j = 1; j <= num_subjects; j++) {
            System.out.print("Enter marks  for suject" + j +":- ");
            int marks = input.nextInt();
            totalMarks = totalMarks + marks;

        }

        int percentage = totalMarks  / num_subjects ;

        System.out.println("Student " + i +" Percentage:- " + percentage +" % ");

        
    }

  }
}
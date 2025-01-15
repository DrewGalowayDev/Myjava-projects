/*Write a Java program that determines the student’s grade . the program will read three types of scores(quiz, 
mid-term and final scores) and determine the grade based on the following rules: [10 marks]
if the average score >=90% grade A
if the average score >= 70% and < 90% grade B
if average score >=50% and <70% grade C
if the average score <50% grade F */

/* 
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        
     int quiz,mid_term,final_score,Avarage;

    Scanner scanner =new Scanner(System.in);
        
    System.out.println("Enter the quiz scores");
    quiz =scanner.nextInt();

    System.out.println("Enter the mid_term scores");
    mid_term =scanner.nextInt();

    System.out.println("Enter the mid_term scores");
    final_score =scanner.nextInt();

    Avarage =(quiz+mid_term+final_score)/3 ;

    System.out.println("The Average Score is"+Avarage);

    int grade;

    if (Avarage >=90 ) {
        System.out.println("Grade A");
        else if (Avarage >= 70 && <90 ) {
            System.out.println("Grade B");  
        }
        else if (Avarage >= 50% && < 70 ) {
            System.out.println("Grade C");  
        
    }
        else if ( Avarage <50 ) {
            System.out.println("Grade F");
            
        } 
        

}
            
        }

        
    }
  

*/
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        
        // Declare variables
        int quiz, midTerm, finalScore;
        double average; // Use double for average to handle decimal values

        Scanner scanner = new Scanner(System.in);
        
        // Input scores
        System.out.println("Enter the quiz score:");
        quiz = scanner.nextInt();

        System.out.println("Enter the mid-term score:");
        midTerm = scanner.nextInt();

        System.out.println("Enter the final score:");
        finalScore = scanner.nextInt();

        // Calculate average
        average = (quiz + midTerm + finalScore) / 3.0; // Use 3.0 to ensure double division

        System.out.println("The Average Score is: " + average);

        // Determine grade
        if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 70 && average < 90) {
            System.out.println("Grade B");  
        } else if (average >= 50 && average < 70) {
            System.out.println("Grade C");  
        } else {
            System.out.println("Grade F");
        }

        scanner.close(); // Close the scanner
    }
}



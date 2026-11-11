package week01.day02;
import  java.util.Scanner;
public class GradeCalc {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mark = -1.0;
        char letterGrade;
        String academicStatus;
        do {
            System.out.print("Please Enter Your Mark: ");
            if(scanner.hasNextDouble()) {
                mark = scanner.nextDouble();
                if (mark < 0.0 || mark > 100.0) {
                    System.out.println("❌ Invalid Score! Mark must be between 0.0 and 100.0.");
                }

            } else{
                System.out.println("You must enter valid number");
                scanner.next();
            }
        }while (!Double.isFinite(mark) || mark < 0.0 || mark > 100.0);

        if (mark >= 90) {
            letterGrade = 'A';
        } else if (mark >= 80) {
            letterGrade = 'B';
        } else if (mark >= 70) {
            letterGrade = 'C';

        } else if (mark >= 60) {
            letterGrade = 'D';

        } else {
            letterGrade = 'F';
        }



       if(mark>=60){
           academicStatus = "PASSED";

       }
       else {
           academicStatus = "FAILED";
       }


       String remark = switch (letterGrade) {
           case 'A' -> "Distinction! Outstanding academic performance.";
           case 'B' -> "Very Good! Great work.";
           case 'C' -> "Good! Keep improving.";
           case 'D' -> "Satisfactory! More effort needed.";
           case 'F' -> "Fail! Please work harder.";
           default -> "Unknown grade.";
       };



       System.out.println("\n-----------------------------------------");

       System.out.printf("Exam Mark Score : %.2f / %.2f%n", mark, 100.0);
       System.out.println("Letter Grade    : " + letterGrade);
       System.out.println("Academic Status : " + academicStatus);
       System.out.println("Remark          : " + remark);

       System.out.println("-----------------------------------------");
   }
}
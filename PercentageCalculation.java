import java.util.Scanner;

public class PercentageCalculation {
   public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
      System.out.print("Enter the marks scored :");
      float marks=scanner.nextInt();
      System.out.print("Enter total marks :");
      float total= scanner.nextInt();
      percentageOfMarks(marks,total);
   }

   public static void percentageOfMarks(float marks, float total) {
      float percentage = (marks*100)/total;
      System.out.println("Percentage ="+ percentage+"%");
   }
}


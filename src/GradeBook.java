import java.util.Objects;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        //Hard-coded variables | Tests: 70%, Homework: 20%, Participation: 10%
        String name = "Jamal";
        float testWeight = 0.70f;
        float homeworkWeight = 0.20f;
        float participationWeight = 0.10f;
        String again = "Yes";

        while(!Objects.equals(again,"Stop"))
        {
            //Assignment user input
            Scanner assignmentName = new Scanner(System.in);
            System.out.print("Enter assignment name: ");
            String assignment = assignmentName.nextLine();
            Scanner assignmentScore = new Scanner(System.in);
            System.out.print("Enter score: ");
            float score = Float.parseFloat(assignmentName.nextLine());
            Scanner assignmentCategory = new Scanner(System.in);
            System.out.print("Enter category: ");
            String category = assignmentName.nextLine();

            //Weight method
            Scanner endLoop = new Scanner(System.in);
            System.out.print("Enter any key to continue, enter 'Stop' to stop inputting scores: ");
            again = assignmentName.nextLine();
            System.out.print(again);
        }
    }
}
import java.util.Objects;
import java.util.Scanner;

public class GradeBook {
    private static double testCalc(double score, int t, double weight) {
        double testGrade = (score*weight)/t;
        return testGrade;
    }

    public static void main(String[] args) {
        //Hard-coded variables | Tests: 70%, Homework: 20%, Participation: 10%
        String name = "Jamal";
        double testWeight = 0.70f;
        double homeworkWeight = 0.20f;
        double participationWeight = 0.10;
        int tterm = 1;
        int hterm = 1;
        int pterm = 1;

        String again = "Yes";
        while(!Objects.equals(again,"Stop"))
        {
            //Assignment user input
            Scanner assignmentName = new Scanner(System.in);
            System.out.print("Enter assignment name: ");
            String assignment = assignmentName.nextLine();
            Scanner assignmentScore = new Scanner(System.in);
            System.out.print("Enter score: ");
            double score = Double.parseDouble(assignmentName.nextLine());
            Scanner assignmentCategory = new Scanner(System.in);
            System.out.print("Enter category (Test, Homework, Participation: ");
            String category = assignmentName.nextLine();

            if (category.equals("Test"))
            {
                System.out.println(testCalc(score, tterm, testWeight));
                tterm++;
            }


            Scanner endLoop = new Scanner(System.in);
            System.out.print("Enter any key to continue, enter 'Stop' to stop inputting scores: ");
            again = assignmentName.nextLine();
            System.out.print(again);
        }
    }
}

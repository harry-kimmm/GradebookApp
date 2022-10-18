import java.util.Objects;
import java.util.Scanner;

public class GradeBook {
    private static double gradeCalc(double score, int t, int t2, int t3, String weight) {
        double testGrade = 0;
        if (weight == "Test") {
            double weightt = 0.70f;
            testGrade = (score * weightt) / t;
        }
        double homeworkGrade = 0;
        if (weight == "Homework") {
            double weighth = 0.20f;
            homeworkGrade = (score * weighth) / t;
        }
        double participationGrade = 0;
        if (weight == "Participation") {
            double weightp = 0.10f;
            participationGrade = (score * weightp) / t;
        }
        double totalGrade = testGrade + homeworkGrade + participationGrade;
        return totalGrade;
    }

    public static void main(String[] args) {
        //Hard-coded variables | Tests: 70%, Homework: 20%, Participation: 10%
        String name = "Jamal";
        int tterm = 1;
        int hterm = 1;
        int pterm = 1;
        double gradeTotal = 0f;

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

            System.out.println(gradeCalc(score, tterm, hterm, pterm, category));
            tterm++;




            Scanner endLoop = new Scanner(System.in);
            System.out.print("Enter any key to continue, enter 'Stop' to stop inputting scores: ");
            again = assignmentName.nextLine();
            System.out.print(again);
        }
    }
}

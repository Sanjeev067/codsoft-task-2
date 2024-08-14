Here is the Java program for the student grade calculator:


import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + " (out of 100):");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}


Output:


Enter the number of subjects:
5
Enter marks for subject 1 (out of 100):
85
Enter marks for subject 2 (out of 100):
90
Enter marks for subject 3 (out of 100):
78
Enter marks for subject 4 (out of 100):
92
Enter marks for subject 5 (out of 100):
88
Total Marks: 433
Average Percentage: 86.6%
Grade: B


This program prompts the user to enter the number of subjects and the marks obtained in each subject. It then calculates the total marks, average percentage, and assigns a grade based on the average percentage. Finally, it displays the total marks, average percentage, and the corresponding grade to the user.
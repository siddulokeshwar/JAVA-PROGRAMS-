import SEE.externals;
import CIE.student;
import CIE.internal;
import java.util.Scanner;

public class final_marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students:");
        int n = sc.nextInt();
        sc.nextLine();

        internal[] i = new internal[n];
        externals[] e = new externals[n];

        for (int j = 0; j < n; j++) {

            System.out.println("Enter name of student " + (j + 1) + " :");
            String Sname = sc.nextLine();

            System.out.println("Enter USN of student:");
            String USN = sc.nextLine();

            System.out.println("Enter current semester of " + Sname + " :");
            int semester = sc.nextInt();

            int[] cieMarks = new int[5];
            for (int k = 0; k < 5; k++){
            System.out.println("Enter marks of sub " +(k+1)+ " :");
                cieMarks[k] = sc.nextInt();
            }
            int[] seeMarks = new int[5];
            for (int k = 0; k < 5; k++){
             System.out.println("Enter marks of sub " +(k+1)+ " :");
                seeMarks[k] = sc.nextInt();
            }
            sc.nextLine();
            i[j] = new internal(Sname, USN, semester, cieMarks);
            e[j] = new externals(Sname, USN, semester, seeMarks);
        }

        System.out.println("\n----- FINAL MARKS OF STUDENTS -----");
        for (int f = 0; f < n; f++) {
            for (int k = 0; k < 5; k++) {
                int finalMarks = (i[f].ciemarks[k]) + (e[f].see_marks[k] / 2);
                System.out.println("Student " + (f + 1) + " Subject " + (k + 1) + ": " + finalMarks);
            }
        }

        sc.close();
    }
}

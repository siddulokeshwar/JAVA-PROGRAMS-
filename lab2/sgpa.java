import java.util.Scanner;
class Student {
    Scanner sc = new Scanner(System.in);

    class Subject {
        int grade, marks, credits;
    }

    Subject s[] = new Subject[8];
    String name, usn;
    double SGPA;

    void getStudentDetails() {
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
    }
    int N;
    void getMarks() {
        System.out.print("Enter number of subjects: ");
        N=sc.nextInt();
        for (int i = 0; i < N; i++) {
            s[i] = new Subject();
        }

        for (int i = 0; i < N; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            s[i].marks = sc.nextInt();
            System.out.print("Enter credits for Subject " + (i + 1) + ": ");
            s[i].credits = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            s[i].grade = (s[i].marks / 10) + 1;
            if (s[i].grade == 11) {s[i].grade = 10;}
            if (s[i].grade <= 4) {s[i].grade = 0;}
        }
    }

    void computeSGPA() {
        int effective_score = 0;
        int total_credits = 0;
        for (int i = 0; i < N; i++) {
            effective_score += s[i].grade * s[i].credits;
            total_credits += s[i].credits;
        }

        SGPA = (double) effective_score / total_credits;
    }
}

public class cgpa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n" + "Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student students[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            students[i] = new Student();
            students[i].getStudentDetails();
            students[i].getMarks();
            students[i].computeSGPA();
        }
        System.out.println("\n===== SGPA Report =====");
        for (int i = 0; i < n; i++) {
            System.out.println("SGPA of " + students[i].name +" (" + students[i].usn + ") is: " + students[i].SGPA);
        }
    }
}
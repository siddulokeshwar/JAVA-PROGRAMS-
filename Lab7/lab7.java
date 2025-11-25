import java.util.Scanner;

class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    protected int father_age;
    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative.");
        }
        father_age = age;
    }
    public void display() {
        System.out.println("Father's age: " + father_age);
    }
}

class Son extends Father {
    private int son_age;
    public Son(int fAge, int sAge) throws WrongAgeException {
        super(fAge);
        if (sAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative.");
        }
        if (sAge >= father_age) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to father's age.");
        }
        son_age = sAge;
    }
    public void display() {
        System.out.println("Son's age: " + son_age);
    }
}

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Father's age: ");
            int f_age = sc.nextInt();
            Father f = new Father(f_age);
            f.display();
            System.out.print("Enter Son's age: ");
            int s_age = sc.nextInt();
            Son s = new Son(f_age, s_age);
            s.display();
        } catch (WrongAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

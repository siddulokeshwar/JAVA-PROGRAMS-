/*Develop a Java program that prints all real solutions to the quadratic
equation ax2+bx+c = 0. Read in a, b, c and use the quadratic formula. If
the discriminate b2-4ac is negative, display a message stating that there
are no real solutions.*/
import java.util.Scanner;
import java.lang.Math;
public class quadratic {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter coeffecient of X^2:");
        a=s.nextInt();
        System.out.println("Enter coeffecient of X:");
        b=s.nextInt();
        System.out.println("Enter a constant :");
        c=s.nextInt();
        if(a==0){
        System.out.println("Not a quadratic equation");
        System.out.println("Enter coeffecient of X^2 other than zero(0):");
        a=s.nextInt();
       }
       d=b*b-4*a*c;
       if(d==0){
        System.out.print("Roots are real and equal:");
        double r1 =((-b)/2*a);
        System.out.println(r1);
       }
       else if(d>0)
       {
        System.out.print("Roots are real and distinct:");
        double r1 = ((-b) + (Math.sqrt(d)))/(double)(2*a);
        double r2 = ((-b) - (Math.sqrt(d)))/(double)(2*a);
        System.out.println(r1+" ,"+r2);
       }
       else if(d<0)
       {
        System.out.print("Roots are not real :");
        double r1 = (-b)/(2*a);
        double r2 = Math.sqrt(-d)/(2*a);
        System.out.println(r1+" ,"+r2);
       }
    }
}

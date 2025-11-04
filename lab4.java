import java.util.Scanner;
abstract class shape{
    int a,b;
    shape(int c){
        a=c;
    }
    shape(int c,int d){
        a=c;b=d;
    }
    void printArea(){}
}
class rectangle extends shape{
    rectangle(int c,int d){
        super(c,d);
    }
    void printArea(){
        System.out.println("Area of rectangle is: "+(double)a*b);
    }
}
class triangle extends shape{
    triangle(int c,int d){
        super(c,d);
    }
    void printArea(){
        System.out.println("Area of triangle is: "+(0.5f)*(a*b));
    }
}
class circle extends shape{
    circle(int c){
        super(c);
    }
    void printArea(){
        System.out.println("Area of circle is: "+(3.14f*a*a));
    }
}
public class lab4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c,d;
        System.out.println("Enter Dimensions of rectangle(length and width):");
        c=sc.nextInt();
        d=sc.nextInt();
        rectangle r = new rectangle(c,d);
        r.printArea();
        System.out.println("Enter Dimensions of triangle(base and height):");
        c=sc.nextInt();
        d=sc.nextInt();
        triangle t = new triangle(c,d);
        t.printArea();
        System.out.println("Enter radius of circle:");
        c=sc.nextInt();
        circle cr =new circle(c);
        cr.printArea();
    }
}

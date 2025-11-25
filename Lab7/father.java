package Lab7;

public class father{
    public int father_age;
    public father(int a) throws WrongAgeException{
        if(a<0){
        throw new WrongAgeException("Age cannot be negative");
    }
        father_age=a;
    }
    public void display(){
        System.out.println("Father's age is :"+father_age);
    }
}
import java.util.Scanner;
class IllegalArgumentException extends Exception{
    IllegalArgumentException(){
        System.out.println("Invalid number!!");
    }
    public IllegalArgumentException(String message){
        super(message);
    }
}
public class average {
    static void avgFirstN(int N){
            try{
                if(N<0){
                    throw new IllegalArgumentException("Cannot find average of zero or -ve number!");
                }
                if(N==0){
                    throw new IllegalArgumentException();
                }
                double avg,sum=0;
                for(int i=0;i<=N;i++)
                {
                    sum = sum +i;
                }
                avg = sum/N;
                System.out.println("Average of "+N+" Numbers is:"+avg);
            }catch(IllegalArgumentException e){
                System.out.println("Caught Error:"+e.getMessage());
            }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number to find average:");
        num =sc.nextInt();
        avgFirstN(num);
    }
}

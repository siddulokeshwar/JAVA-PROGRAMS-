package SEE;
import CIE.student;
public class externals extends student{
    public int see_marks[] = new int[5];
    public externals(String n,String u,int s,int see[]){
        super(n, u, s);
        for(int i=0;i<5;i++){
            see_marks[i]=see[i];
        }
}
}
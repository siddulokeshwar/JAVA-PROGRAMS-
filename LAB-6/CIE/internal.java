package CIE;

public class internal extends student {
    public int ciemarks[] = new int[5];
    public  internal(String n,String u,int s,int cie[])
    {
        super(n,u,s);
        for(int i=0;i<5;i++){
            ciemarks[i]=cie[i];
        }
    }
}

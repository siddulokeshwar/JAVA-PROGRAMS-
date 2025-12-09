class BMS implements Runnable{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("BMS college of Engineering");
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception in BMS");
        }
    }
}

class CSE implements Runnable{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception in CSE");
        }
    }
}

class threads{
    public static void main(String[] args) {
        Thread b = new Thread(new BMS());
        Thread c = new Thread(new CSE());
        b.start();
        c.start();
    }
}
package Simple_Codes;
class MyThread1 extends Thread{
    
    public void run(){
        int i =0;
        while(i<400){
         System.out.println("**************************************************");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
  
    public void run(){
        int i =0;
        while(i<400){
            System.out.println("----------------------------------------- ");
            
            System.out.println("Thread 2 is running ");
            
            i++;
        }
    }
}

public class Threading  {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();

    }
}

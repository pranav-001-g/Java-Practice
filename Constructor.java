package OOP;
class construt{
   private int roll ;
    int name;
    construt(){
        System.out.println("This is the constructor without parameters :");
    }
    construt(int n){
        roll=n;
        System.out.println(roll);
    }

}
public class Constructor {
    public static void main(String[] args) {
        new construt();
        new construt(5);
        
    }
}

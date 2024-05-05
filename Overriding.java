package OOP;
class Animal1
{
    void eat(){
        System.out.println("Animal eat Everything ");
    }
}
class Dear extends Animal1
{
    void eat(){
        System.out.println("Dear eat only grass ");
    }
}
public class Overriding {
    
    public static void main(String[] args) {
        
        Dear d=new Dear();
        d.eat(); // In the case of overriding when we make exactly same function then the object of the class calls the fuction of same class
    }
}

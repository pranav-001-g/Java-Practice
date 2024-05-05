package OOP;
abstract class Animal{
   public String color100;
    Animal()
    {                           // By default the values inside the constructor of parent abstracted class
                                // are the default values of the all the object of child class .
        color100="Brown";
    }
    void jump(){             // non abstact class;                               
        System.out.println("All animal cannot jump ");
    }
    abstract void eat(); // If the function is abstract then this funtion does not have defination 
                        // and this function should be implimented in all the child classes 


}

class Monkey extends Animal{
    void size()
    {
        System.out.println("Monkeys are of medium of size");
    }
     void eat(){
        System.out.println("Monkeys eat fruits ");
     }
     void changecolor(){
        color100="white";
    }
    
}

class Cat extends Animal{
    void size()
    {
        System.out.println("Cats are of size");
    }
     void eat()
    {
        System.out.println("Cats eats fish ");
    }

    void changecolor(){
        color100="white";
    }
}




public class Abstraction {

    public static void main(String[] args) 
    {       
       Cat c1 = new Cat();
       c1.eat();
       c1.size();
       System.out.println("Before runing the function changecolor");
       System.out.println(c1.color100);
       System.out.println("After runing the function changecolor");
       c1.changecolor();
       System.out.println(c1.color100);
       System.out.println("---------------------------------------------------------------------");

       Monkey m1 =new Monkey();
       m1.eat();
       m1.size();
       System.out.println("Before runing the function changecolor");
       System.out.println(m1.color100);
       System.out.println("After runing the function changecolor");
       m1.changecolor();
       System.out.println(m1.color100);

    }
}
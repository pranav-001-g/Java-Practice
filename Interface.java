package OOP;

interface Chess{
    
    void move();  // In the interface the function are by default are Public and Abstract .
}

class King implements Chess{
   public void move(){
        System.out.println("King moves left / right / up / down / cross ( only one step ) ");
    }
}
class Queen implements Chess{
   public void move(){
        System.out.println("Queen moves left / right  up / down / cross (infinite)");
    }
}
class Rook implements Chess{
   public void move(){
        System.out.println("Rook moves left / right / up / down  (infinite) ");
    }
}
class Bishop implements Chess{
   public void move(){
        System.out.println("Bishop moves cross  (infinite)");
    }
}
class Knight implements Chess{
   public void move(){
        System.out.println("Knight moves 2 stemp left / right / up / down / and after this to step one stem                     left / right ");
    }
}
class Pawn implements Chess{
   public void move(){
        System.out.println("Knight moves 2 stemp left / right / up / down / and after this to step one stem                     left / right ");
    }
}

public class Interface {
    
    public static void main(String[] args) {
        
        King k1= new King();
        k1.move();

        Queen q1=new Queen();
        q1.move();

        Rook r1  =new Rook();
        Rook r2  =new Rook();
        r1.move();
        r2.move();

        

        
    }
}

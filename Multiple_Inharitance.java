package OOP;

interface Red
{
    String red="RED";
   void setcolor();
}
//--------------------------------------------------------------------------------------------------------
interface Yellow
{
    String yellow="YELLOW";
   
}
//--------------------------------------------------------------------------------------------------------
interface Green
{
    String green="GREEN";
   
}
//--------------------------------------------------------------------------------------------------------
interface Blue
{
    String blue="Blue";
   
}
//--------------------------------------------------------------------------------------------------------

class Orange implements Red ,Yellow
{
    String color=red+" + "+yellow;
    public void setcolor()
    {
        System.out.println("The color is "+color+" = ORANGE");
    }
}
class Brown implements Red ,Green
{
    String color=red+" + "+green;
    public void setcolor()
    {
        System.out.println("The color is "+color+" = BROWN");
    }
}

public class Multiple_Inharitance {

    public static void main(String[] args) {
        // ORANGE = RED +YELLOW;
        Orange o=new Orange();
        o.setcolor();

        // BROWN =RED + GREEN
        Brown b =new Brown(); // we can only do this when the color has the RED color because we have the  
                              //setcolor function only in the Red class
        b.setcolor();
    }
    
}
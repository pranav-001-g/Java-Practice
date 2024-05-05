package OOP;

class pen 
{
    private int tip=5;
    private String color ="yellow";
//----------------------------------------------------------------------------------------------------------
     
    String getcolor()
    {
        return color;
    }
//----------------------------------------------------------------------------------------------------------
    int gettip()
    {
        return tip;
    }   
//----------------------------------------------------------------------------------------------------------
void setcolor(String color, int tip)
   {
       this.color=color;
       this.tip=tip;
   }
//----------------------------------------------------------------------------------------------------------
    
    
}
class ballpen extends pen{
    static void write(){
        System.out.println("The pen is blue ");
    }
}
class GetterAndSetter {
public static void main(String[] args) 
      {
        pen pob=new pen();
        System.out.println(pob.getcolor()+" "+pob.gettip());
        // System.out.println(pob.color); here we cannot access the color  directly
        pob.setcolor("Green",6);
        System.out.println(pob.getcolor()+" "+pob.gettip());
        
        
     }
}
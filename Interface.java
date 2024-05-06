package Simple_Codes;
interface pranav{
    void pran();
}
interface garje{
    void gar();
}
class time implements pranav,garje{
   public  void pran(){
        System.out.println("Pranav is so lucky boy");}
   public void gar(){
        System.out.println("Garje is sir name of pranav");
    }
}
public class Interface{
    public static void main(String argu[]){
         time p= new time();
         p.pran();
         p.gar();
         
    }
}
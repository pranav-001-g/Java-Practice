package Simple_Codes;
import java.util.*;
public class Task1 {

    public static void main(String arg[]){
        int score=0;
        int ch;
        Scanner obj=new Scanner(System.in );
        System.out.println("________________________________________________________________________");
        System.out.println("Welcome to gaming platform:\n________________________________________________________________________");
        System.out.println("\nThis is the game : in which you have to choose the correct number ");
        System.out.println("Can you choose the correct number between 0 to 100 :\n(note that you have only 10 attempts)\n________________________________________________________________________");
        System.out.println("\nYour Score will be given as ");
        System.out.println("1.If you guess the number in first 2 attempt your will get 10 points:\n2.on second 3 attempt 5 points \n3.for last 5 attemp 3 points ");
        System.out.println("________________________________________________________________________"); 
       do{
        System.out.println("====================== MENU ========================");
        System.out.println("1. Play game ");
        System.out.println("2. Score ");
        System.out.println("3. Exit the game ");
        System.out.println("________________________________________________________________________"); 
        System.out.println("Enter your choice ");
        ch=obj.nextInt();
        if(ch>3 || ch<1)
                {
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("You have enter improper choice please read the instruction carefully. ");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                }
        switch(ch){
            case 1:
            System.out.println("==========================================================================");
            Random numobj =new Random();
            int n= numobj.nextInt(-100,100);
            System.out.println("Enter the number: ");
            int choice;
            int i=1;
            while (true) {
                
                choice=obj.nextInt();
                
                if(choice>100){
                    System.out.println("ohh the number is in the range 0 to 100");
                }
                
               else if(choice==n){
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("---------------------------------------------\nyes you are right the number is "+choice+"\n---------------------------------------------");
                   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    if(i>=1&&i<=3){
                        score=score+10;
                    }
                    else if(i>=4&&i<=6){
                        score=score+5;
                    }
                    else{
                        score=score+3;
                    }
                    break;
                }
                else if(i==10){
                    System.out.println("Sorry no more attempt please try again ,the number was "+n);
                    break;
                    
                }
                
                    System.out.println("you have only "+ (10-i) +" attempts");
                
                    i++;
                 System.out.println("==========================================================================");
            }
            break;
            case 2:
            
            System.out.println("-----------------------------------------------------");
            System.out.println("Your Score is = "+score);
            

        }

       }
       while(ch!=3);
       obj.close();
    }
}

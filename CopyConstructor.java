package OOP;

class Student
{
    String name;
    int roll;
    int marks[]=new int[3];
    int password;

    Student()
    {
        System.out.println("The Program is of the constructor in java ");
      
    }
//---------------------------------------------------------------------------------------------------------
    Student(String name)
    {
       this.name=name;
    }
//---------------------------------------------------------------------------------------------------------
    Student(int roll)
    {
        this.roll=roll;
    }
//---------------------------------------------------------------------------------------------------------
    Student(Student s)
    {
       this.name= s.name;
       this.roll=s.roll;
       this.marks=s.marks;
       this.password=s.password;   
    }
//---------------------------------------------------------------------------------------------------------
    void display()
    {
        System.out.println(name+" "+roll+" "+password);
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
//---------------------------------------------------------------------------------------------------------
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="pranav";
        s1.roll=5;
        s1.marks[0]=80;
        s1.marks[1]=90;
        s1.marks[2]=100;
        s1.password=2545;
        //displaying the data of student s1;
        System.out.println("Display the data of student s1 ");
       s1.display();
        // creating the copy constructor;
        Student s2=new Student(s1);
        //in the above line we have copy the data from s1 to s2 

        s1.password=0000;//if we change the password to 0000 after copying the constructor ,then the value of
                        // s1 will not atomaticaly change is s2 after after copying .
        s1.marks[1]=1;// but in case of array if the value is change after coping the constructor for 
                        // s1 to s2 then also the value changed after coping the constructor get change.
       

        //displaying the data of student s1 which is copyed in student s2;
        System.out.println("\nDisplay the data of student s2 ");
        s2.display();
        //after changing the value of student password;
       


    }
}

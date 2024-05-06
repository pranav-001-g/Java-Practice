package Simple_Codes;
import java.util.*;
public class  Disarium_num{
public static void main(String[] args)
{
int n, sum=0,length=0;
int array[]=new int[100];
int array1[]=new int[100];
int array2[]=new int[100];
Scanner obj = new Scanner(System.in);
System.out.println("How many number wan't to chake ");
n=obj.nextInt();
System.out.println("Enter "+n+" numbers");

for (int i=0;i<n;i++) 
{
array[i]=obj.nextInt();
}
for (int i=0;i<n;i++) 
{ 
int q=array[i];
    while(q>0){
        q=q/10;
        length=length+1; 
        array2[i]=length;
        }
}
for (int i=0;i<n;i++)
{ 
    int q=array[i]; 
    while(q>0)
    {
        int p=q%10;
        q=q/10;
       sum=sum+(int)Math.pow(p,array2[i]); 
       array2[i]=array2[i]-1;
       array1[i]=sum;
    }
    
}
for(int i=0;i<n;i++){
if (array[i]==array1[i]) {
System.out.println(array[i]+" is Disarium number");
}
else{
    System.out.println(array[i]+" is not Disarium number");
}
    
}
obj.close();
}}
package Simple_Codes;
public class OctalToHexadecimal {
    public static void main(String arg[]){
        int o=1;
        int ans=0;
        int n =8; //909 in binary;
        int octal=n;
        while(n>0){
            int p=n%10;
            ans=ans+p*o;
            o=o*8;
            n=n/10;
            
        }
        System.out.println("The Octal number "+octal+" to decimal is = "+ans);
        char hexa[]=new char[100];
        int i=-1;
        while(ans>0){
            if((ans%16)<10){
                hexa[++i]=(char)((ans%16) + 48);
            }
            else{
                hexa[++i]=(char)((ans%16)+55);
            }
            ans=ans/16;
        }
        for(int j=i;j>=0;j--){
            System.out.print(hexa[j]);
        }
    }
}

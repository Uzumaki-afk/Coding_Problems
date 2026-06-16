import java.util.*; 
public class p_2{ 
    public static void main(String args[]) { 
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter a number:"); 
        int n=in.nextInt(); 
        int a=0,c=0,b=0,count=0,n1=0; 
        a=n; 
        c=n; 
        while(a!=0) 
        { 
            count++; 
            a=a/10; 
            
        } 
        while(c!=0) 
        { 
            b=c%10; 
            n1=n1+(int)(Math.pow(b,count)); 
            count--; 
            c=c/10; 
            
        } 
        if(n1 == n) 
        { 
            System.out.println("It is a Disarium number"); 
            
        } 
        else 
        { 
            System.out.println("It is not a Disarium number"); 
            
        } 
        }
    } 

#To change sentences into their binary counterparts without changing the spaces between them to easily distinguish between each letter 
  import java.util.*;
public class encoder_hex_binary{
   public static void main(String args[]){
      String s1="";
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      for(int i=s.length()-1;i>=0;i--)
         {
            char ch=s.charAt(i);
            int j=(int)ch;
            if(j==32){
               s1=" "+s1;
            }
            while(j>0 && j!=32){
               s1=(j%2)+s1;
               j=j/2;
            }
               s1=" "+s1; 
         }
      System.out.print(s1);
   }
}

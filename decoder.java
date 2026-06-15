#Used to convert binary into simple sentences by ASCII values.
  #Input:Enter the binary code for decoding:1010011 1110101 1110000*1000010 1110010 1101111   
  #(* is used to represnt space in this case any suggestions to make it better will be appreciated)
  #Output:Sup Bro

import java.util.*;
class decoder {
    public static void main(String[] args) {
        int j=0;
        String s2="",s3="",s4="";
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the binary code for decoding:");
    String s1=in.nextLine();
        StringTokenizer st=new StringTokenizer(s1,"*");
        int count=0;
        while(st.hasMoreTokens()){
            
           s2=st.nextToken();
            StringTokenizer st1=new StringTokenizer(s2," ");
            
            while(st1.hasMoreTokens()){
                s4=st1.nextToken();
            for(int i=0;i<s4.length();i++)
            {
               char ch=s4.charAt(i);
                if("1".indexOf(ch)!=-1)
                {
                    j+=Math.pow(2,s4.length()-1-i);
                }
                if("1 0".indexOf(ch)==-1)
                {
                   count++;
                }
            }
            char ch2=(char)j;
            j=0;
            s3=s3+ch2;
        }
        
        s3=s3+" ";
        }
        if(count==0)
        System.out.print(s3);
        else
        System.out.print("Invalid binary code");
    }
}

  

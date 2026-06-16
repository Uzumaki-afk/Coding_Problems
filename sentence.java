import java.util.*; 
public class sentence 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a Sentence:"); 
        String s = sc.nextLine(); 
        StringTokenizer str = new StringTokenizer(s); 
        int c = str.countTokens(); 
        if (c == 0) 
        { 
            System.out.println("No words entered!"); 
            return; 
            
        } 
        String max = str.nextToken(); 
        String min = max; 
        String smax = max; 
        String smin = min; 
        while (str.hasMoreTokens()) 
        { 
            String w = str.nextToken(); 
            if (w.length() > max.length()) 
            { 
                max = w; smax = w; 
                
            }  
            else if (w.length() == max.length()) 
            { 
                smax += " " + w; 
                
            } 
            if (w.length() < min.length()) 
            { 
                min = w; 
                smin = w; 
                
            }  
            else if (w.length() == min.length()) 
            { 
                smin += " " + w; 
                
            } 
            
        } 
    System.out.println("The longest words in the sentence is/are: " + smax);
    System.out.println("The shortest words in the sentence is/are: " + smin);
    System.out.println("The number of words in the sentence are: " + c);        
    } 
    
}

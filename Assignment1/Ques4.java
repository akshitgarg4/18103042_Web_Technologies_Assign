import java.io.*; 
import java.util.*; 
public class Ques4 { 
	    static boolean checkAnagrams(char str1[], char str2[]) 
	    {  
	        int count1[] = new int[256]; 
	        Arrays.fill(count1, 0); 
	        int count2[] = new int[256]; 
	        Arrays.fill(count2, 0); 
	        int i; 
	        if (str1.length != str2.length) 
	            return false;
	        for (i = 0; i < str1.length && i < str2.length;i++) 
	        { 
	            count1[str1[i]]++; 
	            count2[str2[i]]++; 
	        }
	        for (i = 0; i < 256; i++)
	        {
	        	if (count1[i] != count2[i]) 
	                return false;
	        }
	        return true; 
	    }
	    public static void main(String args[]) 
	    { 
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter String 1");
	    	String string1=s.next();
	    	System.out.println("Enter String 2");
	    	String string2=s.next();
	        char str1[] = (string1).toCharArray(); 
	        char str2[] = (string2).toCharArray(); 
	        boolean result=checkAnagrams(str1,str2);
	        
	        if (result) 
	        {
	        	 System.out.println("Given Strings are anagrams");
	        }    
	        else
	        {
	        	System.out.println("Given Strings are not anagrams");
	        }
	    } 
	 
}

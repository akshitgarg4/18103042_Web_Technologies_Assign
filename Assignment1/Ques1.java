import java.util.Scanner;
public class Ques1 {  
	    static public void main(String[] args) { 
	        Scanner s=new Scanner(System.in);
	        System.out.print("Enter Text");
	        String text = s.next();
	        System.out.print("Enter Pattern");
	        String pattern= s.next();
	        int M = pattern.length();         
	        int N = text.length();         
	        int ans = 0; 
	        for (int i = 0; i <= N - M; i++) { 
	            int j;             
	            for (j = 0; j < M; j++) { 
	                if (text.charAt(i + j) != pattern.charAt(j)) { 
	                    break; 
	                } 
	            } 
	   
	            if (j == M) {                 
	                ans++;                 
	                j = 0;                 
	            }             
	        }  
	        System.out.print("Total Substrings matched are" + ans);
	    } 
} 


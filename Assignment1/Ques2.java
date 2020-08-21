import java.util.*; 
public class Ques2 {
	public static void main(String[] arg) 
    { 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Vector");
		int n=s.nextInt();
		System.out.println("Enter the Pattern");
		String pattern=s.next();
		String ans="";
		for(int i=0;i<pattern.length();i++)
		{
			if(i==0)
			{
				ans+= pattern.charAt(i);
			}
			else
			{
				ans+="*";
			}
			
		}
		System.out.println("Enter the vector elements");
		Vector<String> v = new Vector<String>(); 
		
		for(int i=0;i<n;i++)
		{
			String element=s.next();
			
			if(element.equals(pattern))
			{
				v.addElement(ans);
			}
			else
			{
				v.addElement(element);
			} 	
		}
        System.out.println("Vector is " + v); 
    } 

}

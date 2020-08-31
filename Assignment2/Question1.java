import java.util.Scanner;
public class Question1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter string 1");
		String string1= s.next();
		System.out.print("Enter string 2");
		String string2= s.next();
		int loc1=0,loc2=0;
		for(int i=0;i<string1.length() && i<string2.length();i++)
		{
			if((int)string1.charAt(i)==(int)string2.charAt(i))
			{
				continue;
			}
			else if((int)string1.charAt(i)>(int)string2.charAt(i))
			{
				loc2++;
				break;
			}
			else
			{
				loc1++;
				break;
			}
		}
		
		if(string1.length()==string2.length() && loc1==0 && loc2==0)
		{
			System.out.print("Both strings are same");
		}
		else if(loc1>0 || (loc1==0 && loc2==0 && string1.length()<string2.length()))
		{
			System.out.print("String 1 is smaller");
		}
		else if(loc2>0 || (loc2==0 && loc1==0 && string2.length()<string1.length()))
		{
			System.out.print("String 2 is smaller");
		}

	}

}

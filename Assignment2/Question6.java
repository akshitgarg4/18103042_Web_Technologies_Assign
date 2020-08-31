import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a positive number greater than 1 to generate Hailstone sequence");
		int n=s.nextInt();
		if(n<1)
		{
			System.out.print("Number less than 1");
		}
		else if(n==1)
		{
			System.out.print("Hailstone Sequence : ");
			System.out.print(" 1");
		}
		else
		{
			System.out.print("Hailstone Sequence : ");
			int x=n;
			while(x!=1 && x<Integer.MAX_VALUE)
			{
				System.out.print(" "+ x +" ");
				if(x%2==0)
				{
					x=x/2;
				}
				else
				{
					x=(x*3)+1;
				}
			}
			if(x>=Integer.MAX_VALUE)
			{
				System.out.println("Integer Overflow Occured");
			}
			else
			{
			System.out.print(" 1");
			}
		}
		

	}

}

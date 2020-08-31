import java.util.Scanner;
public class Question5A {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		long startTime = System.nanoTime();
		
		int universe[]= {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter the size of set A");
		int n1=s.nextInt();
		int A[] = new int[n1];
		System.out.println("Enter elements of set A");
		for(int i=0;i<n1;i++)
		{
			A[i]=s.nextInt();
		}
		System.out.println("Enter the size of set B");
		int n2=s.nextInt();
		int B[] = new int[n2];
		System.out.println("Enter elements of set B");
		for(int i=0;i<n2;i++)
		{
			B[i]=s.nextInt();
		}
		System.out.println("Union of Set A and  set B is: ");
		for(int i=0;i<n1;i++)
		{
			int index=i;
			for(int j=0;j<n2;j++)
			{
				if(A[i]==B[j])
				{
					index=-1;
				}
			}
			for(int k=i+1;k<n1;k++)
			{
				if(A[i]==A[k])
				{
					index=-1;
				}
			}
			if(index!=-1)
			{
				System.out.println(A[i]);
			}
		}
		for(int i=0;i<n2;i++)
		{
			int index=i;
			for(int j=i+1;j<n2;j++)
			{
				if(B[i]==B[j])
				{
					index=-1;
				}
			}

			if(index!=-1)
			{
				System.out.println(B[i]);
			}
		}
		
		
		
		System.out.println("Intersection of Set A and  Set B is: ");
		for(int i=0;i<n1;i++)
		{
			int index=i;
			for(int j=i+1;j<n1;j++)
			{
				if(A[i]==A[j])
				{
					index=-1;
				}
			}
			int found=0;
			for(int k=0;k<n2;k++)
			{
				if(A[i]==B[k])
				{
					found=1;
				}
			}
			if(index!=-1 && found==1)
			{
				System.out.println(A[i]);
			}
		}
		
		
		
		System.out.println("Compliment of Set A is: ");
		for(int i=0;i<11;i++)
		{
			int found=0;
			for(int k=0;k<n1;k++)
			{
				if(universe[i]==A[k])
				{
					found=1;
				}
			}
			if(found==0)
			{
				System.out.println(universe[i]);
			}
		}
		
		
		System.out.println("Compliment of Set B is: ");
		for(int i=0;i<11;i++)
		{
			int found=0;
			for(int k=0;k<n2;k++)
			{
				if(universe[i]==B[k])
				{
					found=1;
				}
			}
			if(found==0)
			{
				System.out.println(universe[i]);
			}
		}
		
		
		//to compute time taken to compute union, intersection and compliment using arrays
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		
	}

}

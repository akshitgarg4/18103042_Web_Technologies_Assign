import java.util.Scanner;
public class Question2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int arr[] = new int [21];
		System.out.print("Enter the size of inputs");
		int n=s.nextInt();
		int arr2[] = new int [n];
		for(int i=0;i<n;i++)
		{
			arr2[i]=s.nextInt();
			arr[arr2[i]]++;
		}
		System.out.print("Original input is :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr2[i]);
		}
		System.out.print('\n');
		System.out.print("Output after using counting sort is :");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			while(count<arr[i])
			{
				System.out.println(i);
				count++;
			}
		}
	}
}

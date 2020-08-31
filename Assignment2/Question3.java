import java.util.Scanner;
public class Question3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of input");
		int n=s.nextInt();
		String arr[] = new String [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = s.next();
		}
		System.out.println("Original input is :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int index=0;
				char[] arr1 = arr[i].toCharArray();
				char[] arr2 = arr[j].toCharArray();
				 
				int loc1=0,loc2=0;
				for(int k=0;k<arr1.length && k<arr2.length;k++)
				{
					if(arr1[k]==arr2[k])
					{
						continue;
					}
					else if(arr1[k] > arr2[k])
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
				
				
				if(arr1.length == arr2.length && loc1==0 && loc2==0)
				{
					//do nothing as both strings are same
				}
				else if(loc1>0 || (loc1==0 && loc2==0 && arr1.length<arr2.length))
				{
					//do nothing as smaller string is at ith index only
				}
				else if(loc2>0 || (loc2==0 && loc1==0 && arr2.length < arr1.length))
				{
					//swap string at arr[j] with arr[i] as arr[j] has smaller string
					
					String dummy = arr[j];
					arr[j] = arr[i];
					arr[i] = dummy;
				}
				 
				
			}
			
		}
		System.out.println("Output after sorting is :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

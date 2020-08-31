
public class Question4 {

	public static void main(String[] args) {
		int n=Integer.MAX_VALUE;
		
		for(int i=n;i>0;i--)
		{
			if(i*(i+1)/2 == i*i)
			{
				System.out.println("ANSWER IS   " + i);
				break;
				
			}
		}
		

	}

}

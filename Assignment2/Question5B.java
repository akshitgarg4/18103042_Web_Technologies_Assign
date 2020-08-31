import java.util.*;
public class Question5B {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		long startTime = System.nanoTime();
		
		
		Set<Integer> universe = new HashSet<Integer>();  
        universe.addAll(Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9,10}));
        
		System.out.println("Enter the size of set A");
		int n1=s.nextInt();
		Set<Integer> A = new HashSet<Integer>();
		Set<Integer> B = new HashSet<Integer>();
		
		System.out.println("Enter elements of set A");
		for(int i=0;i<n1;i++)
		{
			int x=s.nextInt();
			A.add(x);
		}
		System.out.println("Enter the size of set B");
		int n2=s.nextInt();
		
		System.out.println("Enter elements of set B");
		for(int i=0;i<n2;i++)
		{
			int x=s.nextInt();
			B.add(x);
		}
		
		System.out.println("Union of Set A and  set B is: ");
		Set<Integer> union = new HashSet<Integer>(A);  
        union.addAll(B); 
        System.out.println(union);  
        
        
        System.out.println("Intersection of Set A and  set B is: ");
		Set<Integer> intersection = new HashSet<Integer>(A);  
        union.retainAll(B); 
        System.out.println(intersection);
        
        System.out.println("Compliment of Set A is: ");
        Set<Integer> difference1 = new HashSet<Integer>(universe);  
        difference1.removeAll(A);  
        System.out.println(difference1);
        
        
        System.out.println("Compliment of Set B is: ");
        Set<Integer> difference2 = new HashSet<Integer>(universe);  
        difference2.removeAll(B);  
        System.out.println(difference2);
        
        
        //to compute time taken to compute union, intersection and compliment using sets
      	long endTime = System.nanoTime();
      	System.out.println("Took "+(endTime - startTime) + " ns");
	}

}

import java.util.ArrayList;

public class Lambda_one  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
  
        // Using lambda expression to print all elements 
        // of arrL 
        arrL.forEach(n -> System.out.println(n)); 
  
        // Using lambda expression to print even elements 
        // of arrL 
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });
        
        arrL.forEach(n -> System.out.println(n*n));
        
        LambdaFunctions lf = x -> x*x;
        
        System.out.println(lf.square(15));
        
	}

	
	

}

package udemy;

import java.util.ArrayList;
import java.util.Iterator;

public class Stream3 {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList();
		arr.add("Mallika");
		arr.add("Malik");
		arr.add("sidra");
		arr.add("yusuf");
		arr.add("zidan");

		
		
		  //1 way iterating through collection using for each loop
		  
		  for(String list:arr)
		  {
			  System.out.println(list); 
			  }
		  
		  System.out.println("----------------------------------------"); //2 way //
		  
		  //iterating collection through for loop
		  for(int i=0;i<arr.size();i++) {
		  System.out.println(arr.get(i));
		  }
		  
		  System.out.println("----------------------------------------");
		  
		  //3 way iterating through collection using Iterator
		 
		  
		  Iterator<String> it=arr.iterator();
		  while(it.hasNext())
		  {
			  String values=it.next(); System.out.println(values);
			  }
		  
		  //4 way iterating through collection using for each and lamda expression
		  arr.forEach(x -> System.out.println(x));
		  
		 		  
		  //5 way iterating through collection using Method references
		  arr.forEach(System.out::println);

		  
		  
		  

	}

}

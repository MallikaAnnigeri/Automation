package udemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate {
	
	public static void main(String[] args) {
		
	
	List<Integer> lst= Arrays.asList(1,2,3,4,5,6,7,8,9);
	List<Integer> list1 = lst.stream().filter(x->x > 5 && x < 9).collect(Collectors.toList());
	System.out.println(list1);
	
	
	
	
	
	 
	
	 
	
}
}
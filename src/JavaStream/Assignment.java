package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment {
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1, 5, 8, 5, 9, 6, 4, 6);

		// only print unique number if nuber is duplicate it will print only 1 time

		num.stream().distinct().sorted().forEach(ele -> System.out.println(ele));
		
		
		System.out.println("--------------------------------------");
		
		
		List<Integer>listnum=num.stream().distinct().sorted().collect(Collectors.toList());
	    System.out.println(listnum.get(3));
		
		
	}

}

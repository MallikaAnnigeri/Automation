package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream5 {
	public static void main(String[] args) {
		
	
	
   List<String> arr=Arrays.asList("Biryani","kabab","lollipop","mutton keema");
 List<String> result = arr.stream().filter(list-> !list.equals("mutton keema")).collect(Collectors.toList());
   result.forEach(list-> System.out.println(list));
   
   System.out.println("--------------------------------------");
   // other way
   result.forEach(System.out::println);

}
}
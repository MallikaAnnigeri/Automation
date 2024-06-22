package udemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
	
public static void main(String[] args) {
		
		List<Customer> customersList=Arrays.asList(
				   new Customer("mallika", 25),
				   new Customer("shabana",29),
				   new Customer("yusuf",1),
				   new Customer("mallika", 25)

				
				);
		List<String>customernames=customersList.stream()
		.map(Customer::getName)
		.collect(Collectors.toList());
		
		customernames.forEach(System.out::println);
		
		
		

		
}

}

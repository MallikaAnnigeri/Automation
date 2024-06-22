package udemy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamCustomerClass {
	
	public static void main(String[] args) {
		
		List<Customer> customersList=Arrays.asList(
				   new Customer("mallika", 25),
				   new Customer("shabana",29),
				   new Customer("yusuf",1),
				   new Customer("mallika", 25)

				
				);
		
				Customer customerdata = customersList.stream()// converting list into stream
						.filter(x -> "mallika".equals(x.getName()))// filter it for mallika
						.findAny().orElse(null);
				System.out.println(customerdata.getName() + "     " + customerdata.getAge());

				System.out.println("------------------------------------------");

				Customer customerdata2 = customersList.stream()// converting list into stream
						.filter(x -> "mallika".equals(x.getName()) && 25 == x.getAge())// multiple condition
						.findAny().orElse(null);
				System.out.println(customerdata2.getName() + "     " + customerdata2.getAge());
				
				
				
				
   
				
				

		
	}

}

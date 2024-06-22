package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamUdemy {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java", "Selenium", "Sql", "Api","Manual","Android");
		List<String> list1 = Arrays.asList("Mallika", "Shabana", "Sidra", "Zidan","Yusuf","Mallik");

		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i);
			if (value.startsWith("J")) {

				count++;
			}
		}
		System.out.println(count);
		System.out.println("------------------------------------------");
		
		
	    Long l=	list.stream().filter(ele->ele.startsWith("A")).count();
		System.out.println(l);
		
		
		
		System.out.println("------------------------------------------");
      // only 1 value we will get bcz we have specified limit =1
		list.stream().filter(m-> m.length()>4).limit(1)
		.forEach(a->System.out.println(a));
		
		
		System.out.println("-----------------------------------------------");
		
		//only printing values which is having lenegth greater than 4 and coverting lower case to uppercase
		list.stream().filter(m-> m.length()>4).map(a->a.toUpperCase()).forEach(System.out::println);
		
		
		
		
		System.out.println("------------------------------------------------------");

		//starts with a then sort it then convert filter result into uppercase
		list.stream().filter(m-> m.startsWith("A")).sorted().map(a->a.toUpperCase()).forEach(System.out::println);
		
		
		
		
		System.out.println("-----------------------------------------------------------------");
		//merging to collections
	Stream<String> streamlist=	Stream.concat(list.stream(),list1.stream());
	streamlist.sorted().forEach(System.out::println);
		
		
		
	}

}

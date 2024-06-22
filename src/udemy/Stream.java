package udemy;

import java.util.function.Function;

public class Stream {
	
	public static void main(String[] args) {
		
		Function<String,Integer> fnc= x->x.length();
		int count = fnc.apply("Mallika");
		System.out.println(count);
		
		//chaining function
		Function<Integer,Integer> fnc2=x->x * 2;
		int count2 = fnc.andThen(fnc2).apply("Mallika");
		System.out.println(count2);
		
		
		
		
	}

}

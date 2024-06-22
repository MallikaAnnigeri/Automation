package udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Stream2 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Integer> func=(x1,x2)->x1+x2;
		int sum = func.apply(10,50);
		System.out.println(sum);
		
		
		//UnaryOperator
		
		UnaryOperator<Integer> func2=x->x * 7;
	System.out.println(	func2.apply(10));
	
	
	List<String> list=new ArrayList<String>();
	list.add("Mallika");
	list.add("impa");
	list.add("Rutu");
	System.out.println(list);
	list.replaceAll(ele ->ele +" Engineer");
	
	System.out.println(list);
	}

}

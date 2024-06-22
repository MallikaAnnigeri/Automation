package udemy;

import java.util.ArrayList;

public class JavaStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<>();
		name.add("Zidan");
		name.add("Sidra");
		name.add("Yousuf");
		name.add("Zoya");
	Long count= name.stream().filter(m->m.startsWith("Z")).count();
	System.out.println(count);
		
		
	}

}

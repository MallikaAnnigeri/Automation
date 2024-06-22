package selenium;

import java.util.Date;

public class Script18 {
	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d);
		String ds = d.toString();
		String d1 = ds.replaceAll(":","-");
		System.out.println(d1);
		
	}

}

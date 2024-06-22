package selenium;

public class Number {
	public static void main(String[] args) {
		String s="a1b2c3d4";
		char arr[]=s.toCharArray();
		String rev="";
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(Character.isAlphabetic(ch))
			{
				rev=rev+ch;
				
			}
			else if(Character.isDigit(ch))
			{
				int n=Character.getNumericValue(ch);
				
			   for(int j=1;j<=n;j++)
			   {
				   System.out.print(rev);
			   }
			   rev="";
			}
		}
	}

}

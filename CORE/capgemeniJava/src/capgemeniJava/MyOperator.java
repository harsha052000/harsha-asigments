package capgemeniJava;

import java.util.ArrayList;

public class MyOperator implements UnaryOperator<String> {
	public String apply(String t) 
		{
			return t.toUpperCase();
			}
	}

	public class UpperCaseEquivalent {
		public static void main(String[] args)
		{
			List<String> li=new ArrayList<>();
			li.add("Sai");
			li.add("Nithin");
			li.add("arjun");
			li.add("sam");
			System.out.println("----------------------------------------------------------------");
			System.out.println("Elements in list are:");
			System.out.println(li);
			System.out.println("----------------------------------------------------------------");
			System.out.println(" ");
			li.replaceAll(new MyOperator());
			System.out.println("----------------------------------------------------------------");
			System.out.println("Elements in list after replacing with upper case letters are:");
			System.out.println(li);
			System.out.println("----------------------------------------------------------------");		
		}


}

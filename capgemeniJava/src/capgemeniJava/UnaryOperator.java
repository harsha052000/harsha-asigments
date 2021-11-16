package capgemeniJava;

public interface UnaryOperator<T> {
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


}

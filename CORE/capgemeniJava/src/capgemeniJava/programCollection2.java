package capgemeniJava;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class programCollection2 {
public static void main(String[] args) {
			Set<Object> hs=new HashSet<>();
			hs.add(-7);
			hs.add(800);
			hs.add(null);
			hs.add("Hi");
			hs.add(0);
			hs.add(56);
			hs.add(-700);
			hs.add(-7); //will be negleted for being duplicate
			hs.add("hello");
			hs.add("3.14");
			
			System.out.println(hs);
		}
	}




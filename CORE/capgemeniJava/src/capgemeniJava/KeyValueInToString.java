package capgemeniJava;
import java.security.KeyStore.Entry;
import java.util.HashMap;

public class KeyValueInToString {
		public static void main(String[] args)
		{
			HashMap<Integer,String> hs=new HashMap<>();
			StringBuilder sb=new StringBuilder();
			hs.put(1, "ProjectManager");
			hs.put(2, "TeamLead");
			hs.put(3, "SeniorDeveloper");
			hs.put(4, "JuniorDeveloper");
			
			System.out.println("-----------------------------------------------------------------");
			System.out.println("The elements in the hashmap are:");
			System.out.println(hs);
			System.out.println("-----------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("After converting entire hashmap into a string, the result is:");
			for (java.util.Map.Entry<Integer, String> m:hs.entrySet()) 
			{
				sb.append(m);
			}
			System.out.println(sb);
			System.out.println("-----------------------------------------------------------------");
		}

	}



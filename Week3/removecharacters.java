package Week3;
import java.util.LinkedHashSet;
import java.util.Set;

public class removecharacters {

	public static void main(String[] args) {

		String companyName = "google" ;
		
		char[] charArray = companyName.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			unique.add(charArray[i]);
		}
		
		

	}

}
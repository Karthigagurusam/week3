package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>learners=new ArrayList<String>();
learners.add("hema");
learners.add("anil");
learners.add("Raj");
learners.add("saranya");

int count=learners.size();
System.out.println(count);

learners.add(1,"Indhu");
learners.add("anil");
System.out.println(learners);

System.out.println(learners.get(0));

learners.clear();
System.out.println(learners);
Collections.sort(learners);
System.out.println(learners);

for (int i = 0; i < learners.size(); i++) {
	System.out.println();
}
	}
}
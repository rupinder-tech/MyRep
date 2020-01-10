package CollectionDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String args[]) {
		
		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(91);
		mySet.add(32);
		mySet.add(28);
		mySet.add(55);
		mySet.add(76);
		mySet.add(76);
		
		System.out.println(mySet);
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.addAll(mySet);
		tset.add(1);
		System.out.println(tset);
		
		System.out.println(mySet.equals(tset));
 			
	}
}

package CollectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DemoList {

	public static void main(String args[]) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("IBM");
		l1.add("AT&T");
		
		ListIterator<String> itr = l1.listIterator(); 
		
		while(itr.hasNext()) {
			System.out.println("index : " + itr.nextIndex() + " value: " + itr.next());
		}
		
		System.out.println();
		
		while(itr.hasPrevious()) {
			System.out.println("index: " + itr.previousIndex() + " value: " + itr.previous());
		}
		
	}
}

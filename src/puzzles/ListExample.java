package puzzles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> newList = new ArrayList<String>();
		
		newList.add("Prachi");
		newList.add("Khanna");
		
		Iterator<String> newIterator = newList.iterator();
		while(newIterator.hasNext()){
			System.out.println(newIterator.next());
		}
		//Iterator are fail fast. Processing stops as soon as the error occurs.
		// an object cann't be added to iterator when it is iterating and that's because it refer to
		// index while iterating and adding an object increases the index which creates ambiguity. Thsi 
		// might result in concurrentModificationError
		
		
	}

}

package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterUsingHashSet {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "nivi";
		Set testSet = new HashSet();

		for (int i = 0; i < str.length(); i++) {
		    testSet.add(str.charAt(i));
		}
		System.out.println(testSet);
		if (testSet.size() == str.length()) {
		    System.out.println("All charcaters are Unique");
		} else {
		    System.out.println("All charcaters are not unique");
		}

	}

}

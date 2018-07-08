package bi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DplusService {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		Set<Integer> keys1 = map.keySet();
		Set<Integer> keys2 = map.keySet();
		Set<Integer> keys3 = map.keySet();
		System.out.println(keys1);
		keys1.remove(1);
		System.out.println(keys2);
		System.out.println(keys3);
	}
}

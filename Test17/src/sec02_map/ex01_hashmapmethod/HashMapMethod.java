package sec02_map.ex01_hashmapmethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> hMap1 = new HashMap<Integer, String>();
		hMap1.put(2, "bcd");
		hMap1.put(1, "abc");
		hMap1.put(3, "cde");
		System.out.println(hMap1);
		Map<Integer, String> hMap2 = new HashMap<Integer, String>();
		hMap2.putAll(hMap1);
		System.out.println(hMap2.toString());
		hMap2.replace(1, "aaa");
		hMap2.replace(4, "ddd");
		System.out.println(hMap2);
		hMap2.replace(1, "aaa", "bbb");
		hMap2.replace(2, "ccc", "ddd");
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		System.out.println(hMap2.containsKey(1));
		System.out.println(hMap2.containsKey(5));
		System.out.println(hMap2.containsValue("bbb"));
		System.out.println(hMap2.containsValue("ccc"));
		Set<Integer> keySet = hMap2.keySet();
		System.out.println(keySet);
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet);
		System.out.println(hMap2.size());
		hMap2.remove(1);
		hMap2.remove(4);
		System.out.println(hMap2.toString());
		hMap2.remove(2, "bcd");
		hMap2.remove(3, "ccc");
		System.out.println(hMap2);
		hMap2.clear();
		System.out.println(hMap2);
	}
}
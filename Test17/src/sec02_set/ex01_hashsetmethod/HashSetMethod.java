package sec02_set.ex01_hashsetmethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {

	public static void main(String[] args) {
		
		Set<String> hSet1 = new HashSet<>();
		hSet1.add("a");
		hSet1.add("b");
		hSet1.add("c");
		System.out.println(hSet1.toString());
		Set<String> hSet2 = new HashSet<>();
		hSet2.add("b");
		hSet2.add("c");
		hSet2.addAll(hSet1);
		System.out.println(hSet2.toString());
		hSet2.remove("b");
		System.out.println(hSet2.toString());
		hSet2.clear();
		System.out.println(hSet2.toString());
		System.out.println(hSet2.isEmpty());
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("a");
		hSet3.add("b");
		hSet3.add("c");
		System.out.println(hSet3.contains("b"));
		System.out.println(hSet3.contains("d"));
		System.out.println(hSet3.size());
		Iterator<String> iterator = hSet3.iterator();
		// iterator 데이터를 복사해서 가져옴 원래 데이터는 그대로 남아있음
		while(iterator.hasNext()) {
			// hasNext 다음 데이터가 있는지 확인 있을
			System.out.println(iterator.next());
		}   // next 데이터를 하나씩 뽑아옴
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		String[] strArray1 = hSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1));
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
	}
}

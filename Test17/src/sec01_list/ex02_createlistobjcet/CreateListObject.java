package sec01_list.ex02_createlistobjcet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		
		List<Integer> aList1 = new ArrayList<>();
		List<Integer> aList2 = new ArrayList<>(30);
		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>(30);
		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30); 기본생성밖에 사용 할 수 없음
		
		List<Integer> aList7 = Arrays.asList(1,2,3,4);
		List<String> aList8 = Arrays.asList("안녕","방가");
		aList7.set(1,7);
		aList8.set(0,"감사");
		aList7.remove(0);
		
		System.out.println(aList7);
		System.out.println(aList8);
	}
}
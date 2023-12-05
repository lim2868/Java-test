package sec01_list.ex06_arraylistvslinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
		startTime = System.nanoTime(); // 현재 시간이 나노시간으로 되어있는거
		for(int i = 0; i<100000;i++) {aList.add(0,i);}
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 추가 시간 = " +(endTime - startTime) + " ns");
		startTime = System.nanoTime();
		for(int i = 0; i<100000;i++) {linkedList.add(0, i);}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 추가 시간 = " + (endTime-startTime) + " ns");
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++) {aList.get(i);}
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 검색 시간 = " + (endTime-startTime)+ " ns");
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++) {linkedList.get(i);}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 검색 시간 = " + (endTime-startTime)+ " ns");
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {aList.remove(0);}
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 제거 시간 = " + (endTime-startTime)+ " ns");
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++) {linkedList.remove(0);}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 제거 시간 = " + (endTime-startTime)+ " ns");
	}
}
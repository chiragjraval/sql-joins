package com.chirag.ds.structures.list;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> intList = new LinkedList<Integer>(4);
		
		{
			intList.add(1);
			intList.add(2);
			intList.add(3);
			intList.add(4);
			intList.add(5);
			System.out.println(intList.remove(4));
			System.out.println(intList.remove(1));
			System.out.println(intList.remove(10));
			System.out.println(intList.remove(5));
		}

	}

}
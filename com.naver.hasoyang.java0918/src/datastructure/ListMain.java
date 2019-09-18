package datastructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class ListMain {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("색상 보정");
		stack.push("레이어 추가");
		//데이터를 삭제하면서 가져오기는 pop
		//pop대신에 peek를 사용하면 2개의 결과가 동일
		
		String new_data = stack.pop();
		System.out.println(new_data);
		
		new_data = stack.pop();
		System.out.printf("%s\n", new_data);
		
		LinkedList<String> li = new LinkedList<>();
		
		li.add("170");
		li.add("98");
		li.add("105");
		//우선 순위를 가지고 데이터를 저장하는 큐
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("170");
		pq.add("98");
		pq.add("105");
		
		//LinkedList는 순서대로 출력
		for(String temp : li)
		{
			System.out.printf("%s\t", temp);
		}
		System.out.println("\n------------------");
		/*
		for(String temp : pq)
		{
			System.out.printf("%s\t", temp);
		}
		System.out.println("\n------------------");
		*/
		//PriorityQueue는 크기 순서대로
		System.out.printf("%s\n", pq.poll());
		System.out.printf("%s\n", pq.poll());
		System.out.printf("%s\n", pq.poll());
		
	}

}

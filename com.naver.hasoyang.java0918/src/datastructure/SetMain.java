package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		//해시셋을 생성 - 저장은 해싱을 이용
		//중복된 데이터는 저장되지 않음
		//중복된 데이터를 저장하면 add메소드가 false리턴
		//해시 함수는 운영체제가 선택
		Set<Integer> hashSet = new HashSet<>();
		
		hashSet.add(77);
		hashSet.add(44);
		hashSet.add(199);
		hashSet.add(77); //중복된 데이터
		
		for(Integer temp : hashSet)
		{
			System.out.printf("%d\t", temp);
		}
		
		//LinkedHashSet 은 저장된 순서를 기억해서
		//저장한 순서대로 데이터가 추출
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(77);
		linkedHashSet.add(44);
		linkedHashSet.add(199);
		
		System.out.printf("\n----------------------------\n");
		
		//저장한 순서대로 출력
		for(Integer temp : linkedHashSet)
		{
			System.out.printf("%d\t", temp);
		}
		
		//TreeSet : 크기 순서대로 데이터를 추출할 수 있는 Set
		//자료구조에서 Tree라는 말이 나오면 데이터를 저장한 후
		//정렬하는 것이 아니고 데이터를 저장할 때 Tree 구조를 
		//이용해서 정렬하는 방식
		// tree의 순회 방법을 이용해서 작은것 부터 큰 것 (pre order)
		//또는 저장된 순서(In Order)대로출력
		//산술 연산은 Post Order
		
		Set<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(77);
		treeSet.add(44);
		treeSet.add(199);
		
		System.out.printf("\n----------------------------\n");
		
		//크기 순서대로 출력
		for(Integer temp : treeSet)
		{
			System.out.printf("%d\t", temp);
		}
		
	}

}

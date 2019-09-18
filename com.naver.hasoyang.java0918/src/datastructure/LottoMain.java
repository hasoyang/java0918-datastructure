package datastructure;

import java.lang.Math;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LottoMain {

	public static void main(String[] args) {
		//1-45까지의 숫자 6개를 중복없이 저장
		//어떤 자료구조를 이용해서 저장하는 것이 가장 코드를 줄일 수 있는지 생각
		//동일한 자료형의 데이터를 여러개 저장하는 자료구조
		//배열, ArrayList , LinkedList, Stack
		//priorityQueue, ArrayDeque, HashSet, LinkedHashSet, TreeSet
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int [] lottoArr = new int[6];
		
		//결과가 변하지 않고 자주 접근하는 속성이나 메소드의 결과는 지역변수에 저장하고 사용
		int len = lottoArr.length;
		
		for(int i = 0; i < len; i++)
		{
			//input에 정수 입력받기
			System.out.print(" 숫자 입력 (1-45) : ");
			int input = sc.nextInt();
			
			//1-45 사이가 아니라면 다시 입력
			if(input < 1 || input > 45)
			{
				System.out.println("1-45사이의 숫자만 입력!");
				i--;
				continue;
			}
			int j = 0;
			if(i>0)
			{
				for(j = 0; j <= i; j++)
				{
					if(input == lottoArr[j])
					{
						break;
					}
				}
				if(j != i+1)
				{
					System.out.println("같은값은 입력이 안됩니다.");
					i--;
					continue;
				}
			}
			
			//유효성 검사를 통과하면 데이터를 배열에 저장
			lottoArr[i] = input;
		}
		
		
		//데이터 정렬
		//API메소드를 정렬
		Arrays.sort(lottoArr);
		
		//배열의 데이터 출력
		for(int temp : lottoArr)
		{
			System.out.printf("%d\t", temp);
		}
		*/
		
		/*
		PriorityQueue <Integer> lottoQueue = new PriorityQueue<>();
		
		for(int i = 0; i < 6; i++)
		{
			//input에 정수 입력받기
			System.out.print(" 숫자 입력 (1-45) : ");
			int input = sc.nextInt();
			
			//1-45 사이가 아니라면 다시 입력
			if(input < 1 || input > 45)
			{
				System.out.println("1-45사이의 숫자만 입력!");
				i--;
				continue;
			}
			int j = 0;
			for(Integer temp : lottoQueue)
			{
				if(input == temp) {
					j=1;
					break;
				}
			}
			
			//중복된 데이터가 있으면 다시 입력 받기
			if(j == 1)
			{
				System.out.println("같은값은 입력이 안됩니다.");
				i--;
				continue;
			}
			lottoQueue.add(input);
		}
		
		//우선순위큐는 poll을 출력하면 순서대로 출력
		for(int i = 0; i < 6; i++)
		{
			System.out.printf("%d\t", lottoQueue.poll());
		}
		*/
		
		//중복된 데이터를 저장하지 않고 데이터의 크기 순서대로 저장하는 자료구조 객체 만들기		
		TreeSet<Integer> lotto = new TreeSet<>();
		
		while(lotto.size()< 6)
		{
			//input에 정수 입력받기
			System.out.print(" 숫자 입력 (1-45) : ");
			int input = sc.nextInt();
			
			boolean r = lotto.add(input);
			
			//중복된 데이터가 있으면 다시 입력 받기
			if(r == false)
			{
				System.out.println("같은값은 입력이 안됩니다.");
			}
			
		}
		
		//TreeSet은 데이터를 크기 순서대로 접근할 수 있는 방법을 가지고 있기 때문에 정렬을 할 필요가 없음.
		for(Integer temp : lotto)
		{
			System.out.printf("%d\t", temp);
		}
		
		
		sc.close();
	}

}

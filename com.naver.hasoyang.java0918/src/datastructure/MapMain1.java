package datastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain1 {

	public static void main(String[] args) {
		//Map을 생성해서 데이터를 추가하고 갱신하고 삭제
		//변수는 Map으로 선언하고 new를 할 때 실제 자료형을 결정
		//Key의 자료형은 String
		//Value의 자료형은 Object
		
//		Map<String,Object>map = new LinkedHashMap<>();
		Map<String,Object>map = new TreeMap<>();
		//LinkedHashMap - 저장한 순서대로 키를 배치
		//TreeMap - 키의 순서대로정리
		
		//데이터 추가 및 갱신
		//동일한 키에 데이터를 삽입하면 갱신
		map.put("name", "유관순");
		map.put("age", 27);
		map.put("job","학생");
		map.put("age", 18);

		//전체 데이터확인
		//toString 을 호출해서 확인
		System.out.printf("%s\n", map);
		
		map.remove("job");
		
		//key에 해당하는 데이터 가져오기
		System.out.printf("%s\n", map.get("name"));
		System.out.printf("%s\n", map.get("job"));
	
	}

}

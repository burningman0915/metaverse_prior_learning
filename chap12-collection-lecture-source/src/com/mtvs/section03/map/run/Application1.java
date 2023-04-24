package com.mtvs.section03.map.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {
	public static void main(String[] args) {

		/* HashMap */
		Map hMap = new HashMap();
		
		/* 키와 값 객체 저장하기 */
		hMap.put("one", new java.util.Date());
		hMap.put("one", "red apple");			// 기존에 존재하는 키와 일치하는 Entry(key와 value의 쌍)면 기존의 Entry를 덮어씌운다.
		hMap.put(33, 123.5);
		hMap.put("two", "red apple");			// value가 중복 되는건 상관이 없다.
		
		System.out.println("hMap: " + hMap);
		
		/* 값 객체 불러오기 */
		System.out.println("33이라는 key값에 대한 value객체: " + hMap.get(new Integer(33)));
		System.out.println("\"one\"이라는 key값에 대한 value객체: " + hMap.get("one"));
		
		/* 키 객체로 키와 값 객체(Entry) 삭제하기 */
		hMap.remove("one");
		System.out.println("hMap: " + hMap);
		
		/* 저장된 Entry의 수를 확인할 때 */
		System.out.println("hMap에 저장된 entry의 수: " + hMap.size());
		
		Map<String, String> hMap2 = new HashMap<>();
//		Map<String, String> hMap2 = new LinkedHashMap<>();		// 넣은 순서를 유지하고 싶다면 LinkedHashMap으로 교체하자.
		hMap2.put("one", "java 11");
		hMap2.put("two", "oracle 18c");
		hMap2.put("three", "html5");
		hMap2.put("four", "css3");
		hMap2.put("five", "javascript");
		
		/* 1. Map의 toString() 활용 */
		System.out.println("hMap2: " + hMap2);
		
		/* 2. keySet()을 이용해서 키만 따로 Set으로 만들어 iterator()로 활용 */
		Set<String> keys = hMap2.keySet();		// key를 알면 value는 get(key)를 하면 되기 때문에
		Iterator<String> keyIter = keys.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			String value = hMap2.get(key);
			System.out.println(key + " = " + value);
		}
		
		/* 
		 * 3. Map의 entrySet()을 이용해서 키와 값을 동시에 처리
		 *   (feat. java.util.Map.Entry: 키 객체와 값 객체를 쌍으로 묶은 자료형)
		 *   (키를 뽑는 과정 없이도 값을 뽑을 수 있는 장점이 있다.)
		 */
//		Set<Map.Entry<String, String>> set = hMap2.entrySet();
//		Iterator<Map.Entry<String, String>> entryIter = set.iterator();
//		
//		while(entryIter.hasNext()) {
//			Map.Entry<String, String> entry = entryIter.next();
//			System.out.println(entry.getKey() + " = " + entry.getValue());
//		}
	}
}





package ch13_map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapBasic {
    public static void main(String[] args) {
        // key : 정수(int), value : String
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "안녕");
        map1.put(2, "hello");
//        map1.put(3, 100); // value 타입 불일치
//        map1.put("4", "안녕하세요."); // key 타입 불일치
        // key가 1인 데이터
        System.out.println(map1.get(1));
        String s1 = map1.get(2);
        System.out.println("s1 = " + s1);
        map1.put(100, "ㅎㅎㅎㅎ");
        // 동일한 키에 다른 데이터를 넣는다면 => 덮어쓰기 된다.
        map1.put(1, "안녕하십니까");
        System.out.println(map1.get(1));
        // 반복문으로 접근
        for (Integer i : map1.keySet()) { // key만으로 이루어진 객체를 만들어주는 방법
            System.out.println("i = " + i);
        }

        // key : String, value : String
        Map<String, String> map2 = new HashMap<>();
        map2.put("가", "안녕");
        map2.put("나", "ㅎㅎㅎ");
        map2.put("a", "ㅋㅋㅋ");
        System.out.println(map2.get("a"));

        // 반복문
        for (String s : map2.keySet()) {
            System.out.println("s = " + s);
        }

        Map<Long, String> map3 = new HashMap<>();
        // 해당 키에 최초로 값을 저장하는 경우 null이 뜬다.
        // 그러나 해당 키와 관련된 이전 값이 있는 경우, 이전 값이 뜬다.
        String ss1 = map3.put(1L, "안녕");
        System.out.println("ss1 = " + ss1);
        String ss2 = map3.put(2L, "hello");
        System.out.println("ss2 = " + ss2);
        String ss3 = map3.put(1L, "안녕하세요.");
        System.out.println("ss3 = " + ss3);
    }
}

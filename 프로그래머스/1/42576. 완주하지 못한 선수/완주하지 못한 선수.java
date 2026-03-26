import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 중복이름용 카운트맵
        Map<String, Integer> map = new HashMap<>();

        // 참가자 카운트 증가
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 완주자 카운트 감소
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        // map 순회해서 value 0 아닌것 추출
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}
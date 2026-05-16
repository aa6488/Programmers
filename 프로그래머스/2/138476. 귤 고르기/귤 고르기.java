import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int total = 0;

        Map<Integer, Integer> countMap = new HashMap<>();

        // 배열에서 종류별 값 수 계산
        for (int num : tangerine) {

            // 배열에서 포함된 수 체크
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

        }
        // 수 체크한 리스트를 정렬하기
        Collection<Integer> values = countMap.values();

        List<Integer> sortList = new ArrayList<>(values);
        Collections.sort(sortList, Comparator.reverseOrder());

        // 이제 크기 종류의 개수를 큰수부터 하나씩 더해서 k개 를 넘으면 종료시키기
        for (Integer count : sortList) {
            total += count;
            answer++;

            if(total >= k) break;
        }
        
        
        return answer;
    }
}
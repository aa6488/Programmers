import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set  = new HashSet<>();

        // 더할 길이는 정해져있어서 1~n 까지 반복
        // i는 합산할 길이 j는 내부값인덱스
        for(int i = 1; i <= elements.length; i++){
            for(int j = 0; j < elements.length; j++){

                int sum = 0;
                // 실제 i 길이만큼 더하는곳
                // 덧셈하는데 끝자리에서 넘어가면 다시 앞자리로 오게 length 만큼 나머지연산
                for (int k = 0; k < i; k++) {
                    sum += elements[(j+k) % elements.length];
                }
                set.add(sum);

            }
        }
        answer = set.size();
        return answer;
    }
}
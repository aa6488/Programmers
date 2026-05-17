import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        // 좌우 끝 인덱스 정의
        int left = 0;
        int right = people.length-1;

        Arrays.sort(people);

        // 가장 무거운사람 + 가장 가벼운사람 더해서 limit 을 안넘기면 좌우 인덱스 -- ++
        // right 가 left 보다 작아지면 종료
        while (right >= left) {

            // 인덱스 같으면 전체 다 계산하고 하나만 남은거라  보트 1만 추가하고 반복종료
            if (right == left) {
                answer++;
                break;
            }
            int rightValue = people[right];
            int leftValue = people[left];

            // 큰수,작은수 둘다 뺄수있는경우
            if (rightValue + leftValue <= limit) {
                answer++;
                left++;
                right--;
            } else {
                // 그 외의 경우
                answer++;
                right--;
            }

        }
        return answer;
    }
}
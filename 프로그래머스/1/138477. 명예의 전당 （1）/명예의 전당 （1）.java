import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList<Integer> solution(int k, int[] score) {
        // 주어진 score 를 반복문을 돌려 1개씩 추가하여 오름차순으로 정리할 배열
		ArrayList<Integer> list = new ArrayList<>();
		
		// list 배열에서 주어진 제일 작은수를 넣을 제출 배열
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 반복문을 돌려 score에 i번째 수를 배열에 넣는다.
		for(int i =0; i<score.length; i++) {
			list.add(score[i]);
			
			// 넣음과 동시에 오름차순으로 설정한다  그렇게되면 0번째 인덱스
			// 의 값이 제일 작은수가됨
			Collections.sort(list);
			
			// 이 문제는 배열에서 제일작은수를 구하는게아니라 높은수에서 
			// k 에 해당하는 수만큼 자르고 제일 마지막수를 구하는 문제다
			// 그러므로 i 가 k-1 만큼 진행되게되면 list 배열엔 k 만큼의
			// 수가 들어가있기때문에 그 전까지는 0번째 인덱스의값을 answer
			// 배열에 넣고 그 이후부터는 list 전체에서 k만큼을 뺀 수를 넣어준다. 
			if(i <= k-1) {
				answer.add(list.get(0));
			}else {
				answer.add(list.get(list.size()-k));
			}
		}
        return answer;
    }
}
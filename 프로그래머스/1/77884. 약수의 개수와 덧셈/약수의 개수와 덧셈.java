class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        // 약수의 개수를 판단할 변수
		int count = 0;
		
		for(int i =left; i<=right; i++) {
			
			// 1씩증가되는 left 의 약수를 구하는 식
			for(int j =1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			// 약수의 개수가 count 에 들어가있어서 짝수인지 홀수인지 판단하는 식
			if(count%2 == 0) {
				answer += i;
			}else {
				answer += -i;
			}
			count = 0;
			
		}
        return answer;
    }
}
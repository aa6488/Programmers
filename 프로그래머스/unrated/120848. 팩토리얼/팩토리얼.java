class Solution {
    public int solution(int n) {
       int test = 1;
		int sum = 1;
		int answer = 1;
		
		for(int i = 1; i<=test; i++) {
			if(sum*i > n) {
				break;
			}else {
				sum = sum*i;
			}
			test++;
		}
		
		while(sum > 1) {
			answer++;
			sum = sum/answer;
		}
        return answer;
    }
}
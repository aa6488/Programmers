class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
		
		
		for(int i =1; i<k; i++) {
			count += 2;
			
		}
		answer = numbers[count%numbers.length];
        return answer;
    }
}
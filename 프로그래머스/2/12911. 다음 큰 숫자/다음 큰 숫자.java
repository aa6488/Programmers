class Solution {
    public int solution(int n) {
        int answer = n;
        
        // answer의 1의개수
        int countAnswer = Integer.bitCount(answer);

        // 다음큰수의 1의개수 저장
        int countResult = 0;

        while (true) {
            answer++;
            countResult = Integer.bitCount(answer);

            if(countAnswer == countResult)break;

        }
        return answer;
    }
}
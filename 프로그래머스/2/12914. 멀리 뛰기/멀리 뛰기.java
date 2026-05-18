class Solution {
    public long solution(int n) {
        long answer = 0;

        // DP 알고리즘 사용
        // n 까지 가는 방법의 수는 마지막에 점프 기준으로 1칸점프, 2칸점프 이기때문에
        // n-1 까지 가는 방법에 +1칸 이나 n-2 까지 방법에 +2칸 를 하면되기때문에 n = n-1 + n-2 이다 --> 피보나치랑 동일

        // 초기값 설정
        // n == 1 일때 추가
        if (n == 1) {
            answer = 1;
        }else{
            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
            }

            answer = dp[n];
        }
        return answer;
    }
}
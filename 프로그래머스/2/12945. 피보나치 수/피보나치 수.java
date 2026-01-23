class Solution {
    public int solution(int n) {
        int answer = 0;
        int mod = 1234567;
        int[] arr = new int[n+1];

        // 초기값 설정
        arr[0] = 0;
        arr[1] = 1;

        // 최초 mod 안하고 바로넣었는데 오버플로로 바로 나머지 추출해서 넣기
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) %mod;
        }

        answer = arr[n];

        return answer;
    }
}
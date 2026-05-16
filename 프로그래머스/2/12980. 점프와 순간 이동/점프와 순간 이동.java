import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        int total = 0;

        boolean flag = true;

        while (n != 0) {

            // *2로 순간이동하면 도착지가 홀수일수는 없기때문에 1회 점프는 무조건 필요
            if (n % 2 != 0) {
                ans++;
                n--;

            } else {
                // 짝수일경우는 총 이동거리를 /2 함
                n = n / 2;
            }
        }
        
        return ans;
    }
}
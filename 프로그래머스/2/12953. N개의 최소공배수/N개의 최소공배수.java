import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[arr.length-1];

        // 최소 공배수 영어로 Least Common Multiple
        boolean LCMFlag = true;

        while (true) {

            for(int i = 0; i < arr.length; i++){

                if(answer % arr[i] != 0){ LCMFlag = false; break;}

            }

            if(LCMFlag) break;
            LCMFlag = true;
            answer++;
        }
        return answer;
    }
}
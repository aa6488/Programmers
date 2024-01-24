import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] a = s.split("");
		Arrays.sort(a);
		
		String answer = "";
		
		for(int i =a.length-1; i>=0; i--) {
			answer += a[i];
		}
        return answer;
    }
}
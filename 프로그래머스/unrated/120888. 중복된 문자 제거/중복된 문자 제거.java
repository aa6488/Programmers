import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
class Solution {
    public String solution(String my_string) {
        String answer = "";
		String[] test =  my_string.split("");
		
		Set<String> set = new LinkedHashSet<>(Arrays.asList(test));
		
		String[] str = set.toArray(new String[0]);
		
		for(int i = 0; i<str.length; i++) {
			answer += str[i];
		}
		
        return answer;
    }
}
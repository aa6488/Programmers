import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        ArrayList<String> array = new ArrayList<>();
		String answer = "";
		
		for(int i = 0; i<my_string.length(); i++) {
			char a = my_string.charAt(i);
			array.add(Character.toString(a));
		}
		
		for(int i = 0; i<num1; i++) {
			answer += array.get(i);
		}
		answer += array.get(num2);
		
		for(int i = num1+1; i<num2; i++) {
			answer += array.get(i);
		}
		answer += array.get(num1);
		
		for(int i = num2+1; i<array.size(); i++) {
			answer += array.get(i);
		}
        return answer;
    }
}
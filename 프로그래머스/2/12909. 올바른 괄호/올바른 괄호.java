import java.util.LinkedList;
import java.util.Queue;

class Solution {
    boolean solution(String s) {
        String[] a = s.split("");
		boolean answer = false;
		int count = 0;
		
		// 처음들어오는 값이 ) 이면 이미 올바르지 않으니 false 바로리턴
 		if(a[0].contains(")")){
            return false;
        } 
		
        
		
		for(int i=0; i<a.length; i++) {
			
			// 문자가 '(' 이면 count 1씩증가
			if(a[i].contains("(")) {
				count++;
			}else {
			// 그렇지않을때 ')' 문자열 이니까 1씩 감소
				count--;
			// 만약 count 가 음수가나오면 '(' 보다  ')' 가 하나 더 나온거기때문에 바로 false 리턴 
				if(count < 0) return false;
			}
			
		}
		
		// 정상적으로 괄호가 완성되면 count 는 0이나오기때문에 answer 를 true로 변경
		if(count == 0){
            answer = true;
        } 
		return answer;
    }
}
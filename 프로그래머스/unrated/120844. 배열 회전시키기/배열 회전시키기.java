import java.util.*;
class Solution {
    public ArrayList solution(int[] numbers, String direction) {
        ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i<numbers.length; i++) {
			answer.add(null);
		}
		
		if(direction.equals("right")) {
			for(int i = 0; i<numbers.length; i++) {
				if(i == numbers.length-1) {
					answer.set(0, numbers[numbers.length-1]);
				}else {
					answer.set(i+1, numbers[i]);
				}
			}
		}else {
			for(int i = 0; i<numbers.length; i++) {
				if(i == numbers.length-1) {
					answer.set(numbers.length-1, numbers[0]);
				}else {
					answer.set(i, numbers[i+1]);
				}
				System.out.println(answer);
			}
		}
        return answer;
    }
}
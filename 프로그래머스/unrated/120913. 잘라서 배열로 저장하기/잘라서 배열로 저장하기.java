import java.util.ArrayList;
class Solution {
    public ArrayList solution(String my_str, int n) {
        // n개의 개수만큼 배열에 채워지면 인덱스 +1 하기위한 값
		int count = 0;
		
		// my_str 의 전체길이만큼 채워지면 채워진 test String 을 배열에넣기
		int lastCount = 0;
		String test = "";
		
		// n개의 개수만큼 채워졌을때 담을 배열
		ArrayList<String> answer = new ArrayList<>();
		
		//문자열을 하나하나잘랐을때 count++  lastCount++ 해준다.
		// 이후 count 가 n 이 되었을때 배열에넣어주고 count 를 0을만들고 test 문자열           을 빈값으로 만든다
		// 마지막문자열이 n개가 안되었을때에도 값을 넣어주기위해 || 문으로 lastCount가          문자열의 길이가되었을때도 
		// 문자열을 넣어준다.
		for(char a : my_str.toCharArray()) {
			test += Character.toString(a);
			count++;
			lastCount++;
			if(count == n || lastCount == my_str.length()) {
				answer.add(test);
				test = "";
				count = 0;
			}
		}
        return answer;
    }
}
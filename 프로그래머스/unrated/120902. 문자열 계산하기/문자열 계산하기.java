class Solution {
    public int solution(String my_string) {
        // String 을 뛰어쓰기를 기준으로 배열에 담는다
		String[] str = my_string.split(" ");
		
		// 첫번째 값을 answer 에 넣어주고
		int answer = Integer.parseInt(str[0]);
		
		// 배열의 1번인덱스부터 반복문을 돌린다
		for(int i = 1; i<str.length; i++) {
			
			// 인덱스값이 +일경우   인덱스+1값을 더해주고  -일경우 인덱스+1 값을 빼준              다
			if(str[i].equals("+")) {
				answer += Integer.parseInt(str[i+1]);
			}else if (str[i].equals("-")) {
				answer -= Integer.parseInt(str[i+1]);
			}
			
			
		}
        return answer;
    }
}
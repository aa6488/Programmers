class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 주어진 String 을 숫자를 제외한 정규표현식으로 split 해준다. 그렇게되면 
		// a~z,A~Z 부분은 공백으로 처리되고 숫자부분만 배열에 담기게된다
		String[] test = my_string.split("[a-zA-Z]");
 		
		// 이후 for문으로 test 배열의 길이만큼 돌린뒤 test[i] 가 공백이아니면 int형으           로 형변환한뒤
		// 답안을 제출할 answer 에 더해준다.
		for(int i = 0; i<test.length; i++) {
			
			if(!test[i].equals("")) {
				System.out.println(test[i]);
				answer += Integer.parseInt(test[i]);
			}
			
		}
        return answer;
    }
}
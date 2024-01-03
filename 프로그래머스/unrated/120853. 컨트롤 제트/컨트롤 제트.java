class Solution {
    public int solution(String s) {
        int answer = 0;
        // 배열로 공백을 기준으로 배열로 만들어주기
		String[] str = s.split(" ");
		
		// 배열을 돌려서 문자열 Z 가 아닐경우 형변환하여 더하고 문자열 Z 일경우 인덱스         -1 값을 빼준다
		for(int i=0; i<str.length; i++) {
			if(!str[i].equals("Z")) {
			 	answer += Integer.parseInt(str[i]);
			}else {
				answer -= Integer.parseInt(str[i-1]);
			}
			
		}
        return answer;
    }
}
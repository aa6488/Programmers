class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
		
		for(int i =0; i<my_string.length(); i++) {
			char a = my_string.charAt(i);
			if(alp.equals(a+"")) {
				answer += (a+"").toUpperCase();
			}else {
				answer += a+"";
			}
		}
        return answer;
    }
}
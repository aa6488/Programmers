class Solution {
    public int solution(int num, int k) {
        int answer = 0;
		
		String strNum = String.valueOf(num);
		for(int i = 0; i<strNum.length(); i++) {
			char a = strNum.charAt(i);
			String b = Character.toString(a);
			if(b.equals(String.valueOf(k))) {
				answer = i+1;
				break;
			}else {
				answer = -1;
			}
		}
		
        
        return answer;
    }
}
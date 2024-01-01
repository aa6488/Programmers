class Solution {
    public String solution(int age) {
        String test = String.valueOf(age);
		
		String answer = "";
		for(int i = 0; i<test.length(); i++) {
			char a = test.charAt(i);
			
			String b = Character.toString(a);
			
			if(b.equals("0")) {
				answer += "a";
			}else if(b.equals("1")) {
				answer += "b";
			}else if(b.equals("2")) {
				answer += "c";
			}else if(b.equals("3")) {
				answer += "d";
			}else if(b.equals("4")) {
				answer += "e";
			}else if(b.equals("5")) {
				answer += "f";
			}else if(b.equals("6")) {
				answer += "g";
			}else if(b.equals("7")) {
				answer += "h";
			}else if(b.equals("8")) {
				answer += "i";
			}else if(b.equals("9")) {
				answer += "j";
			}
		}
        return answer;
    }
}
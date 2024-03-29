class Solution {
    public int solution(String s) {
        String test = "";
		String test1 = "";
		
		int answer = 0;
		
		
		for(int i=0; i<s.length(); i++) {
			char a = s.charAt(i);
			if(a >=48 && a<= 57) {
				test += a+"";
			}else {
				test1 += a+"";
			}
			
			if(test1.equals("one")) {
				test += "1";
				test1 = "";
			}else if(test1.equals("zero")) {
				test += "0";
				test1 = "";
			}else if(test1.equals("two")) {
				test += "2";
				test1 = "";
			}else if(test1.equals("three")) {
				test += "3";
				test1 = "";
			}else if(test1.equals("four")) {
				test += "4";
				test1 = "";
			}else if(test1.equals("five")) {
				test += "5";
				test1 = "";
			}else if(test1.equals("six")) {
				test += "6";
				test1 = "";
			}else if(test1.equals("seven")) {
				test += "7";
				test1 = "";
			}else if(test1.equals("eight")) {
				test += "8";
				test1 = "";
			}else if(test1.equals("nine")) {
				test += "9";
				test1 = "";
			}
			
		}
		
		answer = Integer.parseInt(test);
        return answer;
    }
}
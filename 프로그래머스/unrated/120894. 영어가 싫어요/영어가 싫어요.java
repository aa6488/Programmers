class Solution {
    public long solution(String numbers) {
        String str = "";
		long answer = 0;
		String test = "";
		
		for(int i = 0; i<numbers.length(); i++) {
			char a = numbers.charAt(i);
			test += a+"";
			if(test.equals("one")) {
				str += "1";
				test = "";
			}else if(test.equals("two")) {
				str += "2";
				test = "";
			}else if(test.equals("three")) {
				str += "3";
				test = "";
			}else if(test.equals("four")) {
				str += "4";
				test = "";
			}else if(test.equals("five")) {
				str += "5";
				test = "";
			}else if(test.equals("six")) {
				str += "6";
				test = "";
			}else if(test.equals("seven")) {
				str += "7";
				test = "";
			}else if(test.equals("eight")) {
				str += "8";
				test = "";
			}else if(test.equals("nine")) {
				str += "9";
				test = "";
			}else if(test.equals("zero")) {
				str += "0";
				test = "";
			}
		}
		answer = Long.parseLong(str);
        return answer;
    }
}
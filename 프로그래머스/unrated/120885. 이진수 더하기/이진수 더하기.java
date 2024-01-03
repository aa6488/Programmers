class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        // 2진수를 10진수로 변환 
		// Integer.parseInt(스트링값 , 변환할 진수값);
		int num1 = Integer.parseInt(bin1, 2);
		int num2 = Integer.parseInt(bin2, 2);
		int sum = num1+num2;
		
		// 변환한 int 를 더한후 Integer.toBinaryString(int값);
		// 해당값을 2진수 String 으로 변환해준다.
		answer = Integer.toBinaryString(sum);
        return answer;
    }
}
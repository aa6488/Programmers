class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // for 문으로 배열의 길이만큼 반복을하고
		for(int i=0; i<array.length; i++) {
			
            // while 반복문으로 array[i] 가 0이상일때만 실행한다
            // array[i] 를 10으로 나눈 나머지값이 7 일때  (1의자리수)
            // answer 에 + 1 을해준다
			while(array[i] > 0) {
				if(array[i]%10 == 7) {
					answer+=1;
				}
                // 이후 array[i] 의 다음자릿수를 구해야하기때문에 10으로 나눠주어
                // 일의자리숫자를 날려준다
				array[i] = array[i]/10;
			}
			
		}
        return answer;
    }
}
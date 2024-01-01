import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        // 순서를 담을 answer 배열을 주어지는 emergency 배열의 길이만큼 만든다.
		int[] answer = new int[emergency.length];
		
		// 해당하는 숫자를 오름차순으로 설정한다
		int[] testOne = emergency.clone();
		Arrays.sort(testOne);
		
		// 오름차순으로만 설정하게되면 제일낮은수가 1 이 되어버리기때문에 
		// 제일 높은 수 부터 1을 만들어주기위해 내림차순으로 변경한다.
		int[] test = testOne.clone();
		
		// 내림차순으로 변경하기위한 count 
		int count = 0;
		
		// count 값은 0부터 1씩 증가하고  비교대상인
		// testOne[i] 의 i 값은 제일 높은 수부터 1씩감소한다.
		// 결과적으론 testOne 의 배열의 역순으로 test배열에 저장되게된다
		for(int i = test.length-1; i>=0; i--) {
			
			test[count] = testOne[i]; 
			count++;
		}
		
		
		// 처음에받은 emergency 배열과 역순으로 만든 배열을 비교한뒤 숫자가 같게되면
		// 해당인덱스+1 의 값을 answer 배열에 넣게되면 
		// emergency 배열의 값에따른 순서값이 메겨지게된다
		for(int i =0; i<emergency.length; i++) {
			
			for(int j = 0; j<test.length; j++) {
				if(emergency[i] == test[j]) {
					answer[i] = j+1;
				}
			}
			
		}
        return answer;
    }
}
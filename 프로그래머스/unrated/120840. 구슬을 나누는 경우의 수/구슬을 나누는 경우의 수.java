class Solution {
    public int solution(int balls, int share) {

        int answer = 0;
		int ballShare = 1;
		long ballsSum = 1;
		//         높은수 부터     볼 수에서 - 볼에서 공유할 공 뺀수
		//        공식의 share ! 를 빼고 분자만 계산한것
		//     n개중    m 개를 뽑는단 가정하에     n!
		//								 (n-m)! * m!
		//  이기때문에    먼저 밑에 반복문은  n이 가장 큰 수기때문에 밑에 두 팩토리얼중 한가지를 무조건 나눌수있다.
		//   m 개를 뽑는 경우의수를 먼저 분모랑 약분을 시킨 반복문이다
		// 또한 반복문과 동시에 ballsSum 에  1부터 증가하는  (n-m)! 을 나누어준다
		// 여기서 for 반복문의 반복되는수가 (n-m)!랑 다를지 신경안써도되는이유는       
		//    분자인  n! 의 개수와      분모의 (n-m)! * m! 의 개수가 같기때문이다  
		//	ex)    n이 10 이고    m 이 5 일때
		//      분자는   10*9*8*7*6*5*4*3*2*1   총 10개이고   
		//     분모엔    (5*4*3*2*1)   *     5*4*3*2*1   총 10개이기때문에 같았다       
		for(int i = balls; i>balls-(balls-share); i--) {
			ballsSum *= i;
			ballsSum /= ballShare;
			ballShare++;
			
		}
		answer = (int)ballsSum;
        
        return answer;
        
        
        
        
        // 스택오버플로우 풀이
        
        //         int answer = 0;
		
// 		// 가지고있는 공 수 - 뽑는수 ! 구하기
// 		long ballShareSum = 1;
		
// 		// 공유할 공 수 ! 구하기
// 		long shareSum = 1;
		
// 		// 가지고있는 공 수 ! 구하기
// 		long ballsSum = 1;
		
		
// 		for(int i = balls-share; i>0; i--) {
// 			ballShareSum *= i;
// 		}
		
		
// 		for(int i = share; i>0; i--) {
// 			shareSum *= i;
// 		}
// 		for(int i = balls; i>0; i--) {
// 			ballsSum *= i;
// 		}
		
		
// 		answer = (ballsSum/(ballShareSum * shareSum));
//         return answer;
    }
}
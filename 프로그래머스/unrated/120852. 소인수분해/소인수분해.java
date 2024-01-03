import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int n) {
        // 약수할 배열 생성
		ArrayList<Integer> array = new ArrayList<>(); 
		// 약수를 구한뒤 소인수를 구할 배열생성
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 약수구하기
		for(int i =2; i<=n; i++) {
			if(n%i == 0) {
				array.add(i);
			}
		}
		
		int count = 0;
		// 소인수 구하기 
		// 소인수를 구할때 약수에서 주어진 n의 개수만큼 반복문을 돌리는데
		// 그 수를 나눴을때 0이나올때마다 count 값을 추가한다.
		// 만약 두번째 반복문이 끝났을때 count 가 1 이 되게되면 약수의 약수는 자기자신           뿐이기때문에
		// 소인수이다 제출배열에 담는다.
		for(int i =0; i<array.size(); i++) {
			
			for(int j = 2; j<=n; j++) {
				if(array.get(i)%j == 0) {
					count++;
				}
			}
			if(count == 1) {
				answer.add(array.get(i));
			}
			count = 0;
		}
        return answer;
    }
}
import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
		int answer = 0;
		
		// 배열에 없는 삼각형의 한 변이 가장 클경우 더하기
		//  시작하는 i 는 sides 배열의 가장큰 수이고  배열에 들어있는 수의 합 까지 반복            한다
		// 이유는 주어지는 삼각형의 변의길이가 가장 길려면 주어진 변길이보다 커야하고 두              변의 합보다 작아야하기때문이다
		for(int i =sides[1]+1; i<sides[0]+sides[1]; i++) {
			answer++;
		}
		
		// 주어진 변중에 큰 수가 가장 길다고 가정할때
		// 나머지 한 수와 주어지지않은변의 길이의 합이 주어진변중 큰수보다 커야하기때문에
		// 주어진배열중 큰수에서 작은수를 빼주고 1을 더해준값을 시작점으로 놓고
		// 제일큰 인덱스보다 작거나 같을때까지 반복한다
		for(int i =sides[1]-sides[0]+1; i<=sides[1]; i++) {
			answer++;
		}
		
		System.out.println(answer);
        return answer;
    }
}
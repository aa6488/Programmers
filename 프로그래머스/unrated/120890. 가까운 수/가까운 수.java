import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        // 배열을 오름차순으로 설정을 안해주게되면 아래 for문의 if문이 아예실행이안되어서
		// array 3,1 배열의 n : 2 같은 크기차이의 숫자가 앞뒤로 있다고가정했을때  뒤에값이 더 작기때문에
		// 뒤에있는값이 answer 로 나와야하지만 그대로 3 이 나오게된다.
		Arrays.sort(array);
		
		// answer는 제출값이고 해당되는 array[i] 번째값이 들어가있는다. 
		// 초기값는 array배열의 0번째 인덱스값이다
		int answer = array[0];
		// test 는 array배열에서 n 을 뺐을때의 절댓값을 넣어놓는 int 변수이다 
		// 초기값은 주어지는 array배열의 0번째인덱스값이다
		int test = Math.abs(array[0]-n);
		// test가  for 반복문에서 나온 Math.abs(array[i]-n) 보다 클때는 
		// test 보다 array[i]-n 값이 더 작다는것이기때문에 test의 값을 변경하고
		// answer : 제출하는 array배열의 값도 array[i] 로 변경한다
		// 가까운수가 여러개일경우를 대비해 if 비교문을 작성할때 크거나같다가 아닌 클때로             설정해놨고 같은숫자가 나오게되면
		// test 엔 그대로 test값이 들어가있게된다
		for(int i =1; i<array.length; i++) {
			if(test > Math.abs(array[i]-n)) {
				test = Math.abs(array[i]-n);
				answer = array[i];
			}
			
			
		}
        return answer;
    }
}
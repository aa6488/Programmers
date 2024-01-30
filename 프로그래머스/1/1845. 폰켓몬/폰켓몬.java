import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 중복을 제거하기위해 HashSet 생성
		Set<Integer> set = new HashSet<>();
		
		// nums 에 있는수를 set 에 넣는다.  자동으로 중복제거됨
		for(int i =0; i<nums.length; i++) {
			set.add(nums[i]);
		}
		
		// nums 를 2를 나눈 수의 포켓몬을 가져가야하니 
		// 만약 가져가는 포켓몬수가 중복을제거한 set 의 길이보다 크게되면 
		// 자동적으로 종류가 다르게 가져갈수있는 최대수는 set의 크기가된다
		// nums/2 가 더 작게되면 포켓몬 종류가 많아도 뽑을수있는수는 nums/2
		// 이기 때문에 결과값은 nums/2 가 된다
		if(nums.length/2 > set.size()) {
			answer = set.size();
		}else {
			answer = nums.length/2;
		}
        return answer;
    }
}
class Solution {
    public int solution(int[][] dots) {
        // 결국 직사각형의 넓이는 dots 배열의 각 첫번째수의 가장큰수,작은수에 차이와
		// 두번째수의  가장큰수,작은수의 차이를 곱하면된다.   
		// 초기값은 0번인덱스의 값으로 기본설정으로 해놓는다
		int xMin = dots[0][0];
		int xMax = dots[0][0];
		
		int yMin = dots[0][1];
		int yMax = dots[0][1];
		
		int x = 0;
		int y = 0;
		
		
		// 첫번째수의 최소값, 최댓값 구하기
		for(int i =0; i<dots.length; i++) {
			if(xMin > dots[i][0]) {
				xMin = dots[i][0];
			}
			
			if(xMax < dots[i][0]) {
				xMax = dots[i][0];
			}
		}
		
		// 두번째 수의 최소값, 최댓값 구하기
		for(int i=0; i<dots.length; i++) {
			if(yMin > dots[i][1]) {
				yMin = dots[i][1];
			}
			
			if(yMax < dots[i][1]) {
				yMax = dots[i][1];
			}
		}
		
		//    최댓값과 최소값의 거리를 구해야하기때문에 해당값의 Max와 Min 의 양수인지 음수인지 같으면 빼주고
		//    Max 와 Min 의 부등호가 반대가되면  절댓값을 이용해서 더해주고 각 수를 곱해준다.
		
		if((xMax >0 && xMin <0) || (xMax <0 && xMin>0)) {
			x =  (Math.abs(xMax)+Math.abs(xMin));
			
		}else {
			x =  Math.abs(Math.abs(xMax)-Math.abs(xMin));
		}
		if((yMax >0 && yMin <0) || (yMax <0 && yMin>0)) {
			y =  (Math.abs(yMax)+Math.abs(yMin));
		}else {
			y =  Math.abs(Math.abs(yMax)-Math.abs(yMin));
		}
		
		int answer =  x*y;
        return answer;
    }
}
class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        // 다음 라운드에 받는 번호는 1,2 = 1  3,4 는 2 이기때문에 (n+1)/2 로 고정이다.
        // 두 수 에서 (n+1)/2 한 값이 같을때가 둘이 붙어서 한 번호로 된거라서 그때 라운드가 만나는 라운드로 취급한다
        while (true) {
             a = (a+1) /2;
             b = (b+1) /2;
             if (a == b)
                break;
             answer++;


        }


        return answer;
    }
}
import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        // 문자하나씩 반복
        for (Character c : s.toCharArray()) {

            // stack 비어있으면 넣기
            if (stack.empty()) {
                stack.push(c);
            }else{
                // stack 비어있지않을때 원래 앞에 들어있던 문자 확인 후 넣을 문자랑 같으면 넣지않고 삭제
                if (stack.peek().equals(c)) {
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        
        if(stack.empty()){
            return 1;
        }else{
            return 0;
        }
        
        
    }
}
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        char[] chArr = s.toCharArray();
        for(char ch : chArr ) {
            if(ch == '(') {
                stack.push(ch);
            } else {
                if(stack.size() == 0) {
                    answer = false;
                    return answer;
                }
                stack.pop();
            }
        }
        
        if(stack.size() == 0) answer = true;
        else answer = false;
        return answer;
    }
}
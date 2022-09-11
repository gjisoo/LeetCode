class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> left = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            // 다음 기호로 계속 초기화
            char c = s.charAt(i);
            // 왼쪽 괄호일 경우 stack에 저장
            if (c == '(' || c == '{' || c == '['){
                left.push(c);
            } // 오른쪽 괄호일때 stack이 비어있지 않고 stack에 마지막으로 저장된 괄호가 왼쪽 괄호일 경우
            else if (c == ')' && !left.isEmpty() && left.peek() == '('){
                left.pop();
            } else if (c == '}' && !left.isEmpty() && left.peek() == '{'){
                left.pop();
            } else if (c == ']' && !left.isEmpty() && left.peek() == '['){
                left.pop();
            } else {
                return false;
            }
        }
        
        if (left.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> left = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                left.push(c);
            } else if (c == ')' && !left.isEmpty() && left.peek() == '('){
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
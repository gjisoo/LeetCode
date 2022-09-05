import java.util.*;
class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character,Integer> symbol = new HashMap<Character,Integer>(7);
        // 기호가 의미하는 값 입력
        symbol.put('I',1);
        symbol.put('V',5);
        symbol.put('X',10);
        symbol.put('L',50);
        symbol.put('C',100);
        symbol.put('D',500);
        symbol.put('M',1000);
        
        int sLength = s.length();
        
        Stack<Integer> value = new Stack<>();
        value.push(symbol.get(s.charAt(0)));
        
        // 기호가 의미하는 값을 스택에 저장
        for(int i = 1; i < sLength; i++){
        // 왼쪽 기호가 의미하는 값이 더 작다면 오른쪽 기호가 의미하는 값에서 뺀 후 저장
            if(value.peek() < symbol.get(s.charAt(i))){
                value.push(symbol.get(s.charAt(i)) - value.pop());
            } else {
                value.push(symbol.get(s.charAt(i)));
            }
        }
        
        int answer = 0;
        while(!value.empty()){
            answer += value.pop();
        }
        
        
        return answer;
    }
}
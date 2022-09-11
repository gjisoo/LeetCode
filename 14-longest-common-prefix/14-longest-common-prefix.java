import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int size = strs.length;
        
        // 비교 요소가 없는 경우 공백 반환
        if(size == 0){
            return "";
        }
        
        // 비교 요소가 1개인 경우 즉시 요소 반환
        if(size == 1){
            return strs[0];
        }
        
        // 요소 2개이상, 한개라도 공백일 경우 공백 반환
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].equals("")){
                return "";
            }
        }
        
        
        Arrays.sort(strs);
        
        // 사전순 정렬된 첫번째 단어 저장
        String std = strs[0];
        int stdLength = std.length();
        
        // 같은 알파벳 개수
        int count = 0;
        
        for(int i = 0; i < stdLength; i++){
            // 사전순 정렬된 첫번째 단어와 마지막 단어 비교
            if(std.charAt(i) == strs[size-1].charAt(i)){
                count++;
            } else {
                break;
            }
        }
        
        return std.substring(0,count);
    }
}
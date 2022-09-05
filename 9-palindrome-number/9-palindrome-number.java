import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        
        String num = Integer.toString(x);
        int numLength = num.length();
        char[] nums = new char[numLength];
        boolean check = false;
        
        // -가 있거나, 첫번째와 마지막숫자가 다를 경우 즉시 false 리턴하고 x가 한자리 일경우 true 리턴
        if( x < 0 ){
            return false;
        } else if ( x - 10 < 0 ){
            return true;
        } else if (num.charAt(0) != num.charAt(numLength-1)) {
            return false;
        }
        
        // 한글자 씩 저장
        for ( int i = 0; i < numLength; i++){
            nums[i] = num.charAt(i);
        }
        
        // 위에서 비교한 가장자리 제외 첫번째, 가운데, 마지막 위치 저장
        int left = 1;
        int mid = numLength/2;
        int right = numLength-2;
        
        // 글자수가 짝수인 경우 가운데가 같지 않다면 즉시 false 리턴
        if (numLength/2 == 0) {
            if (nums[mid-1] != nums[mid]){
                return check;
            }
        }
        
        for(int i = 0; i < mid; i++){
            if(nums[left] == nums[right]){
                left++;
                right--;
                check = true;
            } else {
                check = false;
            }
        }
        
        
        return check;
        
    }
        
}
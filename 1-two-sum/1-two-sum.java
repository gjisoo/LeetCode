import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] answer = new int[2];
        
        for (int i = 0; i < nums.length-1; i++){
            for (int j = 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    if (i == j){
                        continue;
                    } else {
                        answer[0] = i;
                        answer[1] = j;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode result = node;
        
        int sum = 0;
        
        while(l1 != null || l2 != null || sum > 0){
            
            if(l1 != null){
                // l1 이 비어있지 않을때 sum에 l1값을 저장하고 l1은 다음 노드를 가르킴
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            // 다음 노드에 두 수를 더한 일의자리 저장
            node.next = new ListNode(sum % 10);
            // sum에 10의 자리 저장
            sum /= 10;
            // 현재 node를 다음 node로 지정
            node = node.next;
            
        }
        
        return result.next;
    }
}
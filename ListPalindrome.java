public class ListPalindrome {
    // java.util.* has been imported for this problem.
// You don't need any other imports.
    public static class ListNode {
        int data;
        ListNode next;        
        ListNode(int data) { this.data = data; }
    }  



    public static Boolean isListPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;    
           
        ListNode slow = head;
        ListNode fast = head.next.next;
        
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

        }

        
        ListNode mid = null;
        ListNode prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            if(temp == null) mid = slow;
            slow = temp;
        }

        while(mid != null && head != null){
            if(head.data != mid.data) return false;
            head = head.next;
            mid = mid.next;
        }

        return true;
    }

    public static void main(String[] args){
        ListNode n = new ListNode(1);
        n.next = new ListNode(1);
        n.next.next = new ListNode(1);
        n.next.next.next = new ListNode(1);
      //  n.next.next.next.next = new ListNode(2);
      //  n.next.next.next.next.next = new ListNode(1);

        System.out.println(isListPalindrome(n));
    }
}
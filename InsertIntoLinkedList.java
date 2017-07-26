public class InsertIntoLinkedList {
    public static class ListNode {
        int data;
        ListNode next;        
        ListNode(int data) { this.data = data; }
    }

    public static ListNode insertAtPosition(ListNode head, int data, int pos) {
        if(head == null || pos <= 1){
            ListNode n = new ListNode(data);
            n.next = head;
            head = n;
        } else {
            ListNode n = head;
            while(n != null && --pos > 1){
                n = n.next;
            }

            ListNode temp = n.next;
            n.next = new ListNode(data);
            n.next.next = temp;  
            
        }
        
        return head;
    }   

    public static void main(String[] args){
        // null
        
        ListNode a = null;
        print(a);
        print(insertAtPosition(a, 5, 0));

        a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);

        print(a);
        print(insertAtPosition(a, 5, 1));

        a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);

        print(a);
        print(insertAtPosition(a, 5, 2));

        a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);

        print(a);
        print(insertAtPosition(a, 5, 4));

        a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);

        print(a);
        print(insertAtPosition(a, 5, 5));


    }  

    public static void print(ListNode head){
        StringBuilder sb = new StringBuilder();
        if(head == null) {
            sb.append("Null");
        }
        else{
            while(head != null){
                sb.append(head.data);
                if(head.next != null){
                    sb.append(" -> ");
                }
                head = head.next;
            }
        }
        
        System.out.println(sb.toString());
    }
}
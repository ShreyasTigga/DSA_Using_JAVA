public class ReverseLinkedList {

    static ListNode reverseListNode(ListNode head){
        ListNode curr = head, prev = null, next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void printListNode(ListNode head){
        ListNode curr = head;

        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args){
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
    
        printListNode(list);

        list = reverseListNode(list);

        printListNode(list);
    }
}
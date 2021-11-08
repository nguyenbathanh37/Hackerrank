public class PrintLinkedList {
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode p = head;
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
        
    }
}

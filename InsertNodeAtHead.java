public class InsertNodeAtHead {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode insert = new SinglyLinkedListNode(data);
        insert.next = llist;
        llist = insert;
        return llist;   
    }
}

//insert node at head
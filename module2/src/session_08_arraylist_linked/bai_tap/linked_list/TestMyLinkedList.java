package session_08_arraylist_linked.bai_tap.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList myLinkedList = new MyLinkedList(10);

        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        myLinkedList.add(4,9);
//        myLinkedList.add(4,9);
//        myLinkedList.printList();
        myLinkedList.getValue(4);
    }
}

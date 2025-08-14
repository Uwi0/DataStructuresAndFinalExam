package doublyLinkedList;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        int[] numbers = {77, 208, 94, 46, 39, 92, 117, 52, 60, 104, 184, 351};

        for (int num : numbers) {
            dll.insertLast(num);
        }

        System.out.println("Original DLL:");
        dll.displayForward();

        dll.insertAfter(60, 13);
        System.out.println("After inserting 13 after 60:");
        dll.displayForward();

        dll.deleteByValue(46);
        System.out.println("After deleting 46:");
        dll.displayForward();
    }
}

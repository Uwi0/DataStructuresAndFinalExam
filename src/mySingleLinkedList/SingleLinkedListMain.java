package mySingleLinkedList;

public class SingleLinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        int[] numbers = {43, 5, 9, 42, 6, 11, 41, 7, 13, 100, 12, 70, 24, 40, 36, 16, 35, 14, 30, 25};

        for (int num : numbers) {
            list.insertLast(num);
        }

        System.out.println("Original List:");
        list.display();

        list.insertAfter(24, 60);
        System.out.println("After inserting 60 after 24:");
        list.display();

        list.deleteByValue(35);
        System.out.println("After deleting 35:");
        list.display();
    }
}

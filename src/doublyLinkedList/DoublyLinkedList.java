package doublyLinkedList;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;

    public void insertLast(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void insertAfter(int target, int data) {
        DoublyNode current = head;
        while (current != null) {
            if (current.data == target) {
                DoublyNode newNode = new DoublyNode(data);
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public void deleteByValue(int target) {
        DoublyNode current = head;
        while (current != null) {
            if (current.data == target) {
                if (current == head) {
                    head = current.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    public void displayForward() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(",");
            current = current.next;
        }
        System.out.println();
    }
}
package mySingleLinkedList;

public class SingleLinkedList {
    private Node head;

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAfter(int target, int data) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public void deleteByValue(int target) {
        if (head == null) return;

        if (head.data == target) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == target) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(",");
            current = current.next;
        }
        System.out.println();
    }
}
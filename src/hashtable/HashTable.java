package hashtable;


import java.util.LinkedList;

public class HashTable {
    private final int SIZE = 7;
    private final LinkedList<String>[] table;

    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        int hashValue = 0;
        for (char ch : key.toCharArray()) {
            hashValue += ch;
        }
        return hashValue % SIZE;
    }

    public void insert(String key) {
        int index = hash(key);
        table[index].add(key);
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("[" + i + "] -> ");
            for (String item : table[i]) {
                System.out.print(item + " -> ");
            }
            System.out.println("null");
        }
    }
}


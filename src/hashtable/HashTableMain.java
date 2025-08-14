package hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        String[] items = {"Motor", "Mobil", "Bus", "Truk", "Kereta", "Sepeda", "Kapal"};

        for (String item : items) {
            ht.insert(item);
        }

        System.out.println("Hash Table with Chaining:");
        ht.display();
    }
}


//LinkedList
import java.util.LinkedList;

class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("coconut");
        list.addFirst("chickoo");
        list.addLast("strawberry");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.getFirst());

        for (String l : list) {
            System.out.println(l);
        }
    }
}
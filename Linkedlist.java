import java.util.*;
class Linkedlist
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        //add elements into the linked list
        list.add(20);
        list.add(30);
        list.addFirst(10);
        list.addLast(40);
        
        System.out.println(list);
        
        //remove elements into the linked list
        list.removeFirst();
        list.removeLast();
        list.remove(Integer.valueOf(20));
        System.out.println(list);
        
        list.add(20);
        list.addFirst(10);
        list.addLast(40);
        System.out.println(list);
        
        //Traversing using foreach loop
        for(Integer l : list)
        {
            System.out.println(l);
        }
        
        System.out.println("----------------------------------");
        //Traversing using Iterator
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        //Search an element
        System.out.println(list.contains(20));
        System.out.println(list.contains(50));
        
        //get first and last element
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        
        //clear Linked List
        list.clear();
        System.out.println(list);
    }
}

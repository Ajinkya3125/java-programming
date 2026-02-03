//Hashset
import java.util.*;
class Hashset
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
        
        //remove the element
        set.remove(20);
        System.out.println(set);
        
        //element contains in the set or not
        System.out.println(set.contains(40));
        
        //add the null element
        set.add(null);
        set.add(null);
        System.out.println(set);
        
        //accessing all elements usin foreach loop
        for(Integer s : set)
        {
            System.out.println(s);
        }
    }
}
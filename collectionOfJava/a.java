import java.io.*;
import java.util.*;
public class a{
    public static void main(String[] args) throws IOException {
        
        
        //Does not guarantee any specific order of elements.
        //The order in which elements are inserted is not maintained.
        //Internally, a HashSet uses a hash table, and the order depends on the hash codes of the elements.
        
    //     HashSet<Object> hs = new HashSet<>();
    //     hs.add("Shivam");
    //     hs.add("Patra");
    //     hs.add("22CSE126");
    //     hs.add(2026);
    //     hs.add(126);
    //     hs.add("A");
    //     System.out.println(hs);
       
    //    for(Object ob:hs){
    //     System.out.println(ob+" ,Hashcode : "+ob.hashCode());
    //    }
    


        // Maintains the insertion order of the elements.
        // It is implemented using a combination of a hash table and a linked list.
        // The elements are stored in the order they were added, and iteration through the set returns elements in the same order.
       
        // LinkedHashSet<Object> lhs = new LinkedHashSet<>();
        // lhs.add("hii");
        // lhs.add("shivam");
        // lhs.add("I");
        // lhs.add(2.987);
        // lhs.add(143);
        // lhs.add(false);
        // lhs.add(true);
        // System.out.println(lhs);
        // Iterator it = lhs.iterator();
        // while(it.hasNext()){
        //     Object ob = it.next();
        //     System.out.print(ob+" , ");
        //     System.out.println("HashCode : "+ ob.hashCode());
        //     System.out.println();
        // }



        

    }
     
}
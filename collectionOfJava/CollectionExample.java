import java.util.*;

public class CollectionExample{
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("List: " + list);

        // Set Example
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicates not allowed
        System.out.println("Set: " + set);

        // Queue Example
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");
        System.out.println("Queue: " + queue);

        // Map Example
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        System.out.println("Map: " + map);

        //Deque Example
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("Aw");
        deque.addFirst("bw");
        deque.addFirst("xw");
        deque.addLast("qw");
        deque.addFirst("qww");
        System.out.println(deque);
    }
}

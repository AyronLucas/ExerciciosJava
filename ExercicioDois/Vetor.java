
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Vetor {

    public static void main(String[] args) {
        // int[] inteiros = new int[10];
        /*int[] inteiros = { 1, 2, 4, 6, 8, 10 };

        for (int i = 0; i < inteiros.length; i++) {
            System.out.println(inteiros[i]);
        }*/

 /*HashSet<Integer> setter = new HashSet<Integer>();
        setter.add(10);
        setter.add(10);
        System.out.println(setter.contains(11));
        for(Object valor: setter.toArray()) {
            System.out.println(valor);
        }*/

 /*List<Integer> list = new LinkedList<Integer>();

        list.add(10);
        list.add(10);

        for(Object valor: list.toArray()) {
            System.out.println(valor);
        }*/

 /*Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Jackson");

        for(Entry<Integer, String> value : map.entrySet()) {
            System.out.println(value.getKey());
            System.out.println(value.getValue());
        }*/

 /*Queue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
        queue.add(2);
        queue.add(1);

        System.out.println(queue.poll()); // peek() -> Busca o valor e não remove
        System.out.println(queue.poll());
         */
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(2);
        stack.add(1);

        System.out.println(stack.pop()); // peek() -> Busca o valor e não remove
        System.out.println(stack.pop());

    }
}

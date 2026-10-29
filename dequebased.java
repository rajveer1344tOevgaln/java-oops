import java.util.*;
public class dequebased{
    static void dqexmp(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(30);
        dq.addFirst(40);
        dq.addLast(20);
        dq.addLast(10);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);

    }
public static void main(String[] args) {
    dqexmp();
}
}
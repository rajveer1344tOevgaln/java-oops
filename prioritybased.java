//lowest data first priority
import java.util.Comparator;
import java.util.PriorityQueue;
public class prioritybased{
static void PriorityQueue(){
    PriorityQueue<Integer> pq =
new PriorityQueue<>(Comparator.reverseOrder());
 pq.add(30);
 pq.add(20);
 pq.add(34);

 System.out.println(pq.peek());
System.out.println(pq);
System.out.println(pq.poll());
System.out.println(pq);
System.out.println(pq.peek());

}
public static void main(String[] args) {
    PriorityQueue();
}
}
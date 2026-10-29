
import java.util.Stack;
public class stacks {
static void StackExamples(){
    Stack<String> st = new Stack();
    st.push("10");
    st.push("20");
    st.push("50"); 
    System.out.println(st.peek());
    System.out.println(st.pop());
    System.out.println(st.peek());
    System.out.println(st.size());
    st.clear();
    System.out.println(st.empty());

}
 public static void main(String[] args) {
     StackExamples();
 }
 }
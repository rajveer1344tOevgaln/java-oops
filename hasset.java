import java.util.HashSet; 
public class hasset{
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        st.add(2);
        st.add(4);
        st.add(6);
        st.add(50);
        st.add(27);
        st.add(1);
        st.add(79);
        st.add(9);
        System.out.println(st);
        st.add(1);
        st.add(34);
        st.add(9);
        System.out.println(st);
        st.remove(50);
        System.err.println(st);
        System.err.println(st.contains(3));
        System.err.println(st.size());
    }
    }
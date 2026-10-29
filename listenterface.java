import java.util.ArrayList;
public class listenterface{
    static void ArrayList(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1,10);
        System.out.println(l);
        System.out.println(l.contains(10));
        l.add(0,20);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        System.out.println(l.size());

    }


public static void main(String []args){
    ArrayList();
}
}
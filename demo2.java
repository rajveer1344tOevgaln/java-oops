class Task implements Runnable{
    @Override
    public void run(){
        System.out.println("task by"+
        Thread.currentThread().getName());

    }
}
public class demo2{
    public static void main(String[] args) {
        Thread t = new Thread(
            new Task(),"worker-1");
            t.start();
            new Thread(() ->
            System.out.println("lamda")).start();
    }
}
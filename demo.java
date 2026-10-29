class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(
            "running: " + getName());
    }
}
public class demo{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); 
        MyThread t2 = new MyThread();
        t2.start();
    }
}

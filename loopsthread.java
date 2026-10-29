class MyThread extends Thread{
    @Override
    public void run(){
        for(int a = 1; a <= 20; a = a+2){
        System.out.println("odd : "+a);
        }
    }
}
class Threads2 extends Thread{
    @Override
    public void run(){
        for(int i = 2 ; i <= 20; i =i+2){
        System.out.println("even :"+i);
    }
    }
}
public class loopsthread{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        Threads2 t2 = new Threads2();
        t2.start();
    }
}

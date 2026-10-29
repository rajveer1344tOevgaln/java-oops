class MyThread extends Thread{
    @Override
    public void run(){
        for(int a = 1; a <= 20; a = a+2){
        System.out.println(a);

    }
}
public class oddeventhread{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
}
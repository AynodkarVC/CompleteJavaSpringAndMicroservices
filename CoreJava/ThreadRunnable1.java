//Runnable interface is used when we want to make thread a subclass

package clases.CoreJava;

public class ThreadRunnable1{
    public static void main(String[] args){
        // subclass object is created of type super class
        // as Thread() takes Runnable as parameter
        Runnable r1 = new R1();
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = new R2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
// class super class to the R1 thread
class SuperCls{}
// class sub  to both Supcls and Runnable as to make it Thread
class R1  extends SuperCls implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("hii");
        }
    }
}

class R2 implements Runnable{
    public void run(){
        for ( int i = 0; i < 10; i++){
            System.out.println("hello");
        }
    }

}
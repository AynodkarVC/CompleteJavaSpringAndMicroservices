// Threads are used to run programs simultaneously parallel to each other

package clases.CoreJava;

public class Threads{
    public static void main(String[] args) {
        A a= new A();
        B b= new B();
        // start() method is used to start a Thread;
        a.start();
        b.start();
        // getPriority() give priority of thread 1 - 10,
        // 10 been hoghest priority to be executed first.
        System.out.println(a.getPriority());
        b.setPriority(Thread.MAX_PRIORITY);
    }
}

class A extends Thread{
    // run() method is compulsory in Thread
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.println("hiii");
            try{
                Thread.sleep(10);
            }catch (Exception e){
                System.out.println("Exception occured");
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.println("HEllo");
        }
    }
}


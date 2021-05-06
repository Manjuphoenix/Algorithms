import java.util.*;

class CurrentThreadDemo{
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.print("Current Thread:" + t +"\n");

        //change the name of the Thread
        t.setName("MyThread");
        System.out.println("After changing name: "+ t + "\n");

        try {
            for(int n = 5; n > 0; n--){
                System.out.println(n);
                Thread.sleep(1000000);
            }
        }
        catch (InterruptedException e){
            System.out.print("Error");
        }
    }
}
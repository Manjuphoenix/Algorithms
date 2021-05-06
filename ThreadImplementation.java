import java.util.*;

class NewThread implements Runnable{
//    Instantiation of object i.e t of type Thread
    Thread t;

    NewThread() {
        //Create a new second Thread
        t = new Thread(this, "Demo Thread");
//        System.out.println("Working");
        System.out.println("Child Thread" + t);
//        System.out.println("WOrking");
        t.start();
    }

        //Entry point for Second Thread
        public void run(){
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Child Thread" + i);
                    Thread.sleep(1000);
                }
            }
            catch(InterruptedException e) {
                System.out.println("Child Interrupted: ");
            }
        System.out.println("Exiting child Thread!");
    }
}

class ThreadDemo{
    public static void main(String args[]){
        new NewThread();
        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Main Thread" + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
} 

public class MultiThread {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.start(); 

        MyThread t2 = new MyThread();
        t2.start();
    }
}
/*Output:-
~/downloads/java $ javac MultiThread. java
~/downloads/java $ java MultiThread
15 Value 0
14 Value 0
15 Value 1
15 Value 2
15 Value 3
15 Value 4
14 Value 1
14 Value 2
14 Value 3
14 Value 4
~/downloads/java $
*/

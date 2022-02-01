public class PrintABC {

    private int times;
    private int state = 0;
    private Object objectA = new Object();
    private Object objectB = new Object();
    private Object objectC = new Object();
    public PrintABC(int times) {this.times = times;}
    public void printA() {
        print("A", 0, objectA, objectB);
    }
    public void printB() {
        print("B", 1, objectB, objectC);
    }
    public void printC() {
        print("C", 2, objectC, objectA);
    }
    public void print(String name, int targetState, Object curr, Object next) {
        for (int i = 0; i < times; ) {
            synchronized (curr) {
                while (state % 3 != targetState) {
                    try {
                        curr.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                i++;
                state++;
                System.out.print(name);
                synchronized (next) {
                    next.notify();
                }
            }
        }
    }
    public static void main(String[] args) {
        PrintABC p = new PrintABC(10);
        new Thread(new Runnable() {@Override public void run() {
                p.printA();
            }}).start();
        new Thread(new Runnable() {@Override public void run() {
                p.printB();
            }}).start();
        new Thread(new Runnable() {@Override public void run() {
                p.printC();
            }}).start();
    }
}

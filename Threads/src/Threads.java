class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int y = 1; y <= 19; y += 2) {
            System.out.println("Odd: " + y);
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Thread evenThread = new EvenThread();
        Thread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}



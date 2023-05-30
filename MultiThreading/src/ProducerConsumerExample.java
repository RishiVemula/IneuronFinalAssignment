import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerExample {
    private static final int MAX_QUEUE_SIZE = 10;

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Object lock = new Object();
        
        Producer producer = new Producer(queue, lock);
        Consumer consumer = new Consumer(queue, lock);
        
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        
        producerThread.start();
        consumerThread.start();
        
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Producer implements Runnable {
        private Queue<Integer> queue;
        private Object lock;

        public Producer(Queue<Integer> queue, Object lock) {
            this.queue = queue;
            this.lock = lock;
        }

        @Override
        public void run() {
            Random random = new Random();

            while (true) {
                synchronized (lock) {
                    while (queue.size() >= MAX_QUEUE_SIZE) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int number = random.nextInt(100);
                    queue.add(number);
                    System.out.println("Produced: " + number);
                    lock.notifyAll();
                }

                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        private Queue<Integer> queue;
        private Object lock;

        public Consumer(Queue<Integer> queue, Object lock) {
            this.queue = queue;
            this.lock = lock;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (queue.isEmpty()) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int number = queue.poll();
                    System.out.println("Consumed: " + number);
                    lock.notifyAll();
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

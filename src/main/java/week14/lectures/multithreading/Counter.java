package week14.lectures.multithreading;

class CounterMultithreaded implements Runnable {
    private int threadCount;
    public CounterMultithreaded(int threadCount) {
        this.threadCount = threadCount;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " from thread " + this.threadCount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class RunMe {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i ++) {
            CounterMultithreaded counterMultithreaded = new CounterMultithreaded(i);
            Thread t = new Thread(counterMultithreaded);
            t.start();
        }
    }
}

class CounterSync {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SynchronizationExample {
    public static void main(String[] args) {
        CounterSync counter = new CounterSync();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + counter.getCount());
    }
}

import java.util.Queue;

class Waiter extends Thread {
    private int waiterId;
    private Queue<String> cookedFoodQueue;

    public Waiter(int waiterId, Queue<String> cookedFoodQueue) {
        this.waiterId = waiterId;
        this.cookedFoodQueue = cookedFoodQueue;
    }

    @Override
    public void run() {
        while (true) {
            String dish = cookedFoodQueue.poll();
            if (dish == null) {
                break;
            }
            System.out.println("Waiter " + waiterId + " is serving " + dish);
        }
    }
}
import java.util.Queue;

class Chef extends Thread {
    private int chefId;
    private Queue<String> orderQueue;
    private Queue<String> cookedFoodQueue;

    public Chef(int chefId, Queue<String> orderQueue, Queue<String> cookedFoodQueue) {
        this.chefId = chefId;
        this.orderQueue = orderQueue;
        this.cookedFoodQueue = cookedFoodQueue;
    }

    @Override
    public void run() {
        while (true) {
            String order = orderQueue.poll();
            if (order == null) {
                break;
            }

            System.out.println("Chef " + chefId + " is preparing " + order);

            // Simulate cooking time
            try {
                Thread.sleep(2000); // Simulate cooking time
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Add the cooked food to the cooked food queue
            cookedFoodQueue.add(order);
        }
    }
}
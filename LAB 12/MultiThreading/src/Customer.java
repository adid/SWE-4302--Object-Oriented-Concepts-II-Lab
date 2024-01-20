import java.util.Queue;
import java.util.Random;

class Customer extends Thread {
    private int customerId;
    private Queue<String> orderQueue;
    private Receptionist receptionist;

    public int getCustomerId() {
        return customerId;
    }

    public Customer(int customerId, Queue<String> orderQueue, Receptionist receptionist) {
        this.customerId = customerId;
        this.orderQueue = orderQueue;
        this.receptionist = receptionist;
    }

    @Override
    public void run() {
        System.out.println("Customer " + customerId + " is entering the restaurant.");

        receptionist.assignTable(this);

        String[] dishes = {"Burger", "Pizza", "Pasta"};
        Random random = new Random();
        String order = dishes[random.nextInt(dishes.length)];
        System.out.println("Customer " + customerId + " is placing an order for " + order);
        orderQueue.add(order);

        // Wait for the food to be served
        synchronized (this) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Customer " + customerId + " is leaving the restaurant.");
    }
}

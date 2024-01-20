import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        int numTables = 5;
        int numChefs = 2;
        int numWaiters = 3;
        int numCustomers = 10;

        Queue<String> orderQueue = new LinkedList<>();
        Queue<String> cookedFoodQueue = new LinkedList<>();
        Receptionist receptionist = new Receptionist(numTables);

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numCustomers; i++) {
            Customer customer = new Customer(i,orderQueue, receptionist);
            threads.add(customer);
            customer.start();
        }

        for (int i = 0; i < numChefs; i++) {
            Chef chef = new Chef(i, orderQueue, cookedFoodQueue);
            threads.add(chef);
            chef.start();
        }

        for (int i = 0; i < numWaiters; i++) {
            Waiter waiter = new Waiter(i, cookedFoodQueue);
            threads.add(waiter);
            waiter.start();
        }

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        System.out.println("--------------------------------------------------");
        System.out.println("All customers served.");
        System.out.println("Simulation complete.");
    }
}
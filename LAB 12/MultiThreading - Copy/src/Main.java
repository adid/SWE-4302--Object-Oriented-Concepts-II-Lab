import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Customer extends Thread {
    private static int customerCount = 0;
    private int customerId;
    private Queue<String> orderQueue;
    private Receptionist receptionist;

    public Customer(Queue<String> orderQueue, Receptionist receptionist) {
        this.customerId = ++customerCount;
        this.orderQueue = orderQueue;
        this.receptionist = receptionist;
    }

    @Override
    public void run() {
        System.out.println("Customer " + customerId + " is entering the restaurant.");

        // Place order
        String[] dishes = {"Burger", "Pizza", "Pasta"};
        Random random = new Random();
        String order = dishes[random.nextInt(dishes.length)];

        synchronized (orderQueue) {
            System.out.println("Customer " + customerId + " is placing an order for " + order);
            orderQueue.add(order);
        }

        // Wait for table assignment
        receptionist.assignTable(this);

        // Wait for the food to be served
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Customer " + customerId + " is leaving the restaurant.");
    }
}

class Chef extends Thread {
    private static int chefCount = 0;
    private int chefId;
    private Queue<String> orderQueue;
    private Queue<String> cookedFoodQueue;

    public Chef(Queue<String> orderQueue, Queue<String> cookedFoodQueue) {
        this.chefId = ++chefCount;
        this.orderQueue = orderQueue;
        this.cookedFoodQueue = cookedFoodQueue;
    }

    @Override
    public void run() {
        while (true) {
            String order;
            synchronized (orderQueue) {
                order = orderQueue.poll();
            }

            if (order == null) {
                break;
            }

            System.out.println("Chef " + chefId + " is preparing " + order);

            try {
                // Simulate cooking time with a random sleep duration
                Thread.sleep(new Random().nextInt(2000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (cookedFoodQueue) {
                cookedFoodQueue.add(order);
            }
        }
    }
}

class Waiter extends Thread {
    private static int waiterCount = 0;
    private int waiterId;
    private Queue<String> cookedFoodQueue;

    public Waiter(Queue<String> cookedFoodQueue) {
        this.waiterId = ++waiterCount;
        this.cookedFoodQueue = cookedFoodQueue;
    }

    @Override
    public void run() {
        while (true) {
            String dish;
            synchronized (cookedFoodQueue) {
                dish = cookedFoodQueue.poll();
            }

            if (dish == null) {
                break;
            }

            System.out.println("Waiter " + waiterId + " is serving " + dish);
        }
    }
}

class Receptionist {
    private int tableCount;

    public Receptionist(int tableCount) {
        this.tableCount = tableCount;
    }

    public synchronized void assignTable(Customer customer) {
        System.out.println("Receptionist is assigning a table to Customer " + customer.getId());

        // Simulate processing time for table assignment
        try {
            Thread.sleep(new Random().nextInt(1000) + 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        customer.start(); // Start the customer thread after assigning a table
    }
}

class RestaurantSimulation {
    public static void main(String[] args) {
        int numTables = 5;
        int numChefs = 2;
        int numWaiters = 3;
        int numCustomers = 10;

        Queue<String> orderQueue = new LinkedList<>();
        Queue<String> cookedFoodQueue = new LinkedList<>();
        Receptionist receptionist = new Receptionist(numTables);

        // Create chef threads
        ArrayList<Chef> chefs = new ArrayList<>();
        for (int i = 0; i < numChefs; i++) {
            Chef chef = new Chef(orderQueue, cookedFoodQueue);
            chefs.add(chef);
            chef.start();
        }

        // Create waiter threads
        ArrayList<Waiter> waiters = new ArrayList<>();
        for (int i = 0; i < numWaiters; i++) {
            Waiter waiter = new Waiter(cookedFoodQueue);
            waiters.add(waiter);
            waiter.start();
        }

        // Create customer threads
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 0; i < numCustomers; i++) {
            Customer customer = new Customer(orderQueue, receptionist);
            customers.add(customer);
            customer.start();
        }

        // Wait for all customer threads to finish
        for (Customer customer : customers) {
            try {
                customer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Interrupt chef threads to terminate them
        for (Chef chef : chefs) {
            chef.interrupt();
        }

        // Interrupt waiter threads to terminate them
        for (Waiter waiter : waiters) {
            waiter.interrupt();
        }

        System.out.println("Simulation completed.");
    }
}

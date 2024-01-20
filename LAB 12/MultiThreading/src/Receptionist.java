class Receptionist {
    private int tableCount;

    public Receptionist(int tableCount) {
        this.tableCount = tableCount;
    }

    public synchronized void assignTable(Customer customer) {
        System.out.println("Receptionist is assigning a table to Customer " + customer.getId());
//        customer.start(); // Start the customer thread after assigning a table
    }
}
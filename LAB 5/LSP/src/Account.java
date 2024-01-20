class Account
{
    String accountNumber;
    String accountHolderName;
    double balance;
    String signature;

    public Account(String accountNumber, String accountHolderName, String signature)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.signature = signature;
        this.balance = 0;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount) throws UnsupportedOperationException
    {
        if (amount > balance)
            throw new UnsupportedOperationException("Insufficient balance.");
        balance -= amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public double calculateInterest() throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException("Interest calculation not supported for this account type.");
    }
}
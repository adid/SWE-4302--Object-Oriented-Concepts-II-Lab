class SavingAccount extends Account
{
    static final double Min_Balance = 1000;
    static final double Max_Withdraw = 15000;
    static final double Interest = 0.10;

    public SavingAccount(String accountNumber, String accountHolderName, String signature)
    {
        super(accountNumber, accountHolderName, signature);
    }

    @Override
    public void withdraw(double amount) throws UnsupportedOperationException
    {
        if (amount > Max_Withdraw)
            throw new UnsupportedOperationException("Maximum withdrawal limit exceeded.");
        super.withdraw(amount);
    }

    @Override
    public double calculateInterest()
    {
        return balance * Interest;
    }
}
class CurrentAccount extends Account
{
    private static final double Min_Balance = 500;
    private static final double Max_Withdraw = 20000;
    private static final double Interest = 0.08;

    public CurrentAccount(String accountNumber, String accountHolderName, String signature)
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
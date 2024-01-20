class IslamicAccount extends Account
{
    private static final double Min_Balance = 200;
    private static final double Max_Withdraw = 10000;

    public IslamicAccount(String accountNumber, String accountHolderName, String signature)
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
}
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

public class AccountTest
{
    SavingAccount a= new SavingAccount("210042170", "Nirjhar", "nj");
    CurrentAccount b= new CurrentAccount("210042171","Alvee", "al");
    IslamicAccount c= new IslamicAccount("2100042172","Adid","ad");


    @Test
    public void testSavingAccountBalance()
    {
        Assert.assertEquals(0, a.getBalance(), 0.01);
    }

    @Test
    public void testSavingAccountWithdraw()
    {
        a.deposit(12000);
        try
        {
            a.withdraw(13000);
            Assert.assertEquals(0, a.getBalance(), 0.01);
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println("Insufficient balance.");
        }
    }

    @Test
    public void testCurrentAccountWithdraw()
    {
        b.deposit(50000);
        try
        {
            b.withdraw(22000);
            Assert.assertEquals(0, b.getBalance(), 0.01);
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println("Maximum withdrawal limit exceeded.");
        }
    }

    @Test
    public void testIslamicAccountWithdraw()
    {
        c.deposit(50000);
        try
        {
            c.withdraw(2000);
            Assert.assertEquals(48000, c.getBalance(), 0.01);
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println("Maximum withdrawal limit exceeded.");
        }
    }

    @Test
    public void testCalculateInterest()
    {
        c.deposit(50000);
        try
        {
            Assert.assertEquals(48000, c.calculateInterest(), 0.01);
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println("Interest calculation not supported for this account type.");
        }
    }

    @Test
    public void testCalculateInterest2()
    {
        b.deposit(50000);
        Assert.assertEquals(4000, b.calculateInterest(), 0.01);
    }

    @Test
    public void testCalculateInterest3()
    {
        a.deposit(50000);
        Assert.assertEquals(5000, a.calculateInterest(), 0.01);
    }

    @Test
    public void testCurrentAccountBalance()
    {
        b.deposit(12320.12);
        try
        {
            b.withdraw(1312.03);
            Assert.assertEquals(11008.09, b.getBalance(), 0.01);
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println("Interest calculation not supported for this account type.");
        }
    }

    @Test
    public void testIslamicAccountBalance()
    {
        c.deposit(24320.12);
        try
        {
            b.withdraw(1012);
            Assert.assertEquals(11008.09, b.getBalance(), 0.01);
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println("Interest calculation not supported for this account type.");
        }
    }
}

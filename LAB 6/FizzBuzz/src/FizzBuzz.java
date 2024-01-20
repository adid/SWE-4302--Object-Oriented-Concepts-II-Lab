public class FizzBuzz
{
    public String getFizzyBuzz(int n)
    {
        if (n%3==0 && n%7==0)
        {
            return "Fizzbuzz";
        }
        else if(n%3==0)
        {
            return "Fizz";
        }
        else if (n%7==0)
        {
            return "Buzz";
        }
        else
        {
            return "Gotcha";
        }
    }
}

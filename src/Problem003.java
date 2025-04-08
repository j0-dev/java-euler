import java.util.ArrayList;

public class Problem003
{
    public static void main(String[] args)
    {
        ArrayList<Integer> factors = factorsOf(13195);
        ArrayList<Integer> primes = returnPrimes(factors);
        for (Integer prime : primes)
        {
            System.out.println(prime);
        }
    }

    public static ArrayList<Integer> factorsOf(int number)
    {
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(number);

        for (int i = 1; i <= (number / 2); i++)
        {
            if (number % i == 0)
            {
                factors.add(i);
            }
        }

        return factors;
    }

    // takes an arraylist of integers and returns only the *ones not divisible by 2*
    public static ArrayList<Integer> returnPrimes(ArrayList<Integer> numsList)
    {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (Integer i : numsList)
        {
            if (i % 2 != 0)
            {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    // checks if num is prime
    public boolean isPrime(int x)
    {
        int a = 3;
        double power = Math.pow(a, x);

        if (2 <= (x - 1))
        {
            power(Math.ceilMod(x))
        }
    }


}



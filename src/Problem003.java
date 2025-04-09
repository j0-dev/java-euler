import java.util.ArrayList;

public class Problem003
{
    public static void main(String[] args)
    {
        ArrayList<Long> factors = factorsOf(600851475143L);
        ArrayList<Long> primes = returnPrimes(factors);
        for (Long prime : primes)
        {
            System.out.println(prime);
        }
    }

    public static ArrayList<Long> factorsOf(long number)
    {
        ArrayList<Long> factors = new ArrayList<>();
        factors.add(number);

        for (int i = 1; i < number; i++)
        {
            if (i != 0)
            {
                if (number % i == 0)
                {
                    factors.add((long) i);
                }
            }

        }
        return factors;
    }

    // takes an arraylist of integers and returns only the *ones not divisible by 2*
    public static ArrayList<Long> returnPrimes(ArrayList<Long> numsList)
    {
        ArrayList<Long> primeNumbers = new ArrayList<>();

        for (Long i : numsList)
        {
            if (isPrime(i))
            {
                primeNumbers.add((long)i);
            }
        }
        return primeNumbers;
    }

    // checks if num is prime
    public static boolean isPrime(long x)
    {
        if (x <= 1)
        {
            return false;
        }

        for (int i = 2; i < x; i++)
        {
            if (x % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}



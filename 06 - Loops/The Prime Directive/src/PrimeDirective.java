import java.util.ArrayList;

class PrimeDirective {

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.onlyPrimes(numbers));

    }

    public boolean isPrime(int number) {
        if (number == 2) { return true; }
        else if (number < 2) { return false; }
        for (int testNumber = 2; testNumber * testNumber < number; testNumber++) {
            if (number % testNumber == 0) { return false; }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers) {
            if (isPrime(number)) { primes.add(number); }
        }
        return primes;
    }

}
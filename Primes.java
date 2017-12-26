package q2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class Primes.
 * <p>
 * Decides if a number is a prime and prints all the prime numbers 
 * ranging from 0 to the number of user input.
 * </p>
 * @author Zhang Yuanyuan
 * @version 2017-11-10
 */
public class Primes {
    /**boolean list for numbers.*/
    private List<Boolean> primes;
    
    /**
     * Constructs Primes objects.
     * @param n initailizes ArrayList with boolean value
     * @throws IllegalArgumentException throws exceptions if the 
     *         argument is illegal
     */
    public Primes(int n) throws IllegalArgumentException {
        primes = new ArrayList<Boolean>();
        for (int i = 0; i < n; i++) {
            primes.add(true);
        }
        calculatePrimes(n);
    }
    /**
     * Determines which indices are prime and sets it to true.
     * @param n sets the range to check
     * @throws IllegalArgumentException throws exceptions if the 
     *         argument is illegal
     */
    private void calculatePrimes(int n) throws IllegalArgumentException {
        
        primes.set(0, false);
        primes.set(1, false);
        for (int i = 2; i < n; i++) {
            if (primes.get(i)) {
                for (int j = 2; i * j < n; j++) {
                    primes.set((i * j), false);
                }
            }
        }
    }
    /**
     * Prints out the list of primes.
     */
    public void printPrimes() {
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
          }
        }
    }
    /**
     * Returns the number of primes.
     * @return counter the number of primes
     */
    public int countPrimes() {
        int i = 0;
        int counter = 0;
        while (i < primes.size()) {
            if (primes.get(i)) {
                counter++;
            }
            i++;
        }
        return counter;
    }
    /**
     * Determines whether the number is prime.
     * @param x an int accepted to check
     * @return true if x is a prime, otherwise false
     * @throws IllegalArgumentException throws exceptions if the 
     *         argument is illegal
     */
    public boolean isPrime(int x) throws IllegalArgumentException {
        return primes.get(x);
    }
    
    
    /**
     * <p>Drives the program.</p>
     *
     * @param args command line arguments.
     * @throws IOException throws exceptions
     */
    public static void main(String[] args) throws IOException {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("This program uses the sieve of Eratosthenes to "
            + "determine\nwhich numbers are prime.\n\nEnter an upper "
            + "bound:\n");
        n = scan.nextInt();
        while (n < 1) {
            System.out.println("upper bound should greater than 1: ");
            n = scan.nextInt();
        } 
        Primes p = new Primes(n);  
        
        System.out.println("\nThere are " + p.countPrimes() + " primes:\n");
        System.out.println("The prime numbers between 0 and " + n + " are:\n");
        p.printPrimes();
        System.out.println("\nQuestion two was called and ran sucessfully.");
        scan.close();
    }

};

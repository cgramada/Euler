import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.sun.istack.internal.Nullable;

import java.util.List;

public class Problem003 {
    public static void main(String[] args) {
        long n = 600851475143L;
        double q = Math.sqrt(n);

        List<Integer> primes = getPrimes(q);

        int largest = 1;

        for (int prime : primes) {
            if (n % prime == 0) {
                largest = prime;
            }
        }

        System.out.println(largest);

    }

    private static List<Integer> getPrimes(double q) {
        List<Integer> primes = Lists.newArrayList(2);

        for (int i = 3; i < q; i++) {
            final int prime = i;

            boolean notPrime = Iterables.any(primes, new Predicate<Integer>() {
                @Override
                public boolean apply(@Nullable Integer integer) {
                    return prime % integer == 0;
                }
            });

            if (!notPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}

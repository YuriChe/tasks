package newHardSkills.sort;

import java.util.HashSet;
import java.util.TreeSet;

public class Spec implements ISpec {
    @Override
    public TreeSet<Integer> primeSet(Integer to) {
        if (to < 1) {
            throw new RuntimeException("Запрос чисел меньше 1");
        }
        TreeSet<Integer> primeNumbers = new TreeSet<>();
        int temp;
        if (to < 5) {
            temp = to;
        } else temp = 3;
        switch (temp) {
            case 4:
                ;
            case 3:
                primeNumbers.add(3);
            case 2:
                primeNumbers.add(2);
                break;
        }
        boolean divided;
        for (int i = 4; i < to; i++) {
            divided = false;
            for (Integer x : primeNumbers) {
                if (i % x == 0) {
                    divided = true;
                    break;
                }
            }
            if (!divided) {
                primeNumbers.add(i);
            }
        }
        primeNumbers.add(1);
        return primeNumbers;
    }

    @Override
    public boolean isPrime(Integer x) {
        if (x < 1) {
            return false;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public HashSet<Integer> primeHashSet(Integer to) {
        if (to < 1) {
            return null;
        }
        HashSet<Integer> primeNumbers = new HashSet<>();
        int temp;
        if (to < 5) {
            temp = to;
        } else temp = 3;
        switch (temp) {
            case 4:
                ;
            case 3:
                primeNumbers.add(3);
            case 2:
                primeNumbers.add(2);
                break;
        }
        boolean divided;
        for (int i = 4; i < to; i++) {
            divided = false;
            for (Integer x : primeNumbers) {
                if (i % x == 0) {
                    divided = true;
                    break;
                }
            }
            if (!divided) {
                primeNumbers.add(i);
            }
        }
        primeNumbers.add(1);
        return primeNumbers;
    }

}

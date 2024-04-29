package newHardSkills;

import java.util.Scanner;


public class StandartM {
    // классы. объекты
    public static String inStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int inInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    int sum2(int a, int b) {
        return a + b;
    }

    boolean equalNumbers(int a, int b) {
        return countNum(a) == countNum(b);
    }

    int countNum(int a) {
        //подсчет разрядов числа
        int num = a;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    double ave2(int[] a) {
        double avg = 0;
        double[] sumByNum = new double[a.length];
        int i = 0;
        for (int num :
                a) {
            while (num != 0) {
                avg += num % 10;
                num /= 10;
            }
            sumByNum[i++] = avg;
            avg = 0;
        }
        for (double x :
                sumByNum) {
            avg += x;
        }
        avg = avg / sumByNum.length;
        return avg;
    }

    int countMax(int a) {
        int num = a;
        int x = 0;
        while (num != 0) {
            if ((num % 10) > x) {
                x = num % 10;
            }
            num /= 10;
        }
        return x;
    }

    boolean isPrimeNum(int a) {
        //простое или нет число
        if (a <= 0 || a == 4 || a == 6 || a == 8 || a == 9) {
            return false;
        }
        for (int i = 2; i < a / 3; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    int leftNum(int a) {
        int num;
        num = (int) (a / Math.pow(10, (countNum(a) - 1)));
        return num;
    }

    boolean isEqExtreme(int a, int b) {
        if (leftNum(a) == b % 10) {
            return true;
        }
        return false;
    }

    void divisorsNum(int a) {
        //делители числа
        if (!isPrimeNum(a)) {
            System.out.print("Делители: ");
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    System.out.print(i + ", ");
                }
            }
        } else {
            System.out.println("Число простое. Делители: " + "1, " + a);
        }
    }

    void primeNumRange(int N) {
        // вывод строки простых чисел от 0 в диапазоне до N
        for (int i = 1; i < N; i++) {
            if (isPrimeNum(i)) {
                System.out.print(i + " ");
            }
        }
    }

    void primeNumRange2(int N, int N2) {
        // вывод строки простых чисел от N в диапазоне до N2
        for (int i = N; i < N2; i++) {
            if (isPrimeNum(i)) {
                System.out.print(i + " ");
            }
        }
    }

    boolean isBeenNum(int X, int D) {
        if (D > 10 || D < 0) {
            System.out.println("Введите цифру от 0 до 9");
            return false;
        }
        int num = X;
        int numCurrent;
        while (num != 0) {
            numCurrent = num % 10;
            if (numCurrent == D) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    int isBeenNumCount(int X, int D) {
        // подсчет сколько раз цифра в числе
        // -1 - Введите цифру от 0 до 9
        if (D > 10 || D < 0) {
            return -1;
        }
        int num = X;
        int numCurrent;
        int count = 0;
        while (num != 0) {
            numCurrent = num % 10;
            if (numCurrent == D) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    int reverseNum(int a) {
        int num = a;
        int numRes = 0;
        int[] numNew = new int[countNum(a)];
        for (int i = 0; i < numNew.length; i++) {
            numNew[i] = (int) (num % 10 * Math.pow(10, numNew.length - 1 - i));
            num /= 10;
        }
        for (int x :
                numNew) {
            numRes += x;
        }
        return numRes;
    }

    boolean isSymmetrical(int a) {
        return (a == reverseNum(a));
    }

    int evenOrOdd(int a) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < 10; i = i + 2) {
            countEven += isBeenNumCount(a, i);
        }
        for (int i = 1; i < 10; i = i + 2) {
            countOdd += isBeenNumCount(a, i);
        }
        if (countEven == countOdd) {
            return 0;
        }
        if (countEven > countOdd) {
            return 1;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        StandartM st = new StandartM();
//        System.out.println(st.sum2(5, 8));
//        System.out.println(st.countNum(657840));
//        System.out.println(st.countMax(2109978980));
//            System.out.println(st.equalNumbers(inInt(), 654));
//            int[] array = {22, 22};
//            System.out.println(st.ave2(new int[]{2, 20, 20, 20}));
//            System.out.println(st.primeNum(101));
//            System.out.println(st.isPrimeNum(0));
//            System.out.println(st.isPrimeNum(-18));
//            System.out.println(st.isPrimeNum(51));
//            System.out.println(st.isPrimeNum(83));
//            System.out.println(st.leftNum(484552136));
//            System.out.println(st.isEqExtreme(548, 8774));
//            st.divisorsNum(87455264);
//                st.primeNumRange(100);
//                st.primeNumRange2(100, 10);
//
//        System.out.println(st.isBeenNum(65892, 78));
//        System.out.println(st.isBeenNumCount(6589254, 5));
//        System.out.println(st.reverseNum(123456));
//        System.out.println(st.isSymmetrical(inInt()));
//        System.out.println(st.evenOrOdd(inInt()));

    }
}



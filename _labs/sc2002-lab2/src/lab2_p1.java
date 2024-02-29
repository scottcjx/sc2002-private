
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;


public class lab2_p1 {
    public static void main(String[] args)
    {
        int choice;
        int opd1, opd2, ret;
        long opd3, retl;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest();
                    break;
                case 2: /* add divide() call */
                    System.out.print("m: ");
                    opd1 = sc.nextInt();
                    System.out.print("n: ");
                    opd2 = sc.nextInt();
                    ret = divide(opd1, opd2);

                    if (ret >= 0) System.out.printf("%d/%d = %d \n\n", opd1, opd2, ret);
                    break;
                case 3: /* add modulus() call */
                    System.out.print("m: ");
                    opd1 = sc.nextInt();
                    System.out.print("n: ");
                    opd2 = sc.nextInt();
                    ret = modulus(opd1, opd2);

                    if (ret >= 0) System.out.printf("%d %% %d = %d \n\n", opd1, opd2, ret);
                    break;
                case 4: /* add countDigits() call */
                    System.out.print("n: ");
                    opd1 = sc.nextInt();
                    ret = countDigits(opd1);

                    if (ret >= 0) System.out.printf("n: %d - count = %d \n\n", opd1, ret);
                    break;
                case 5: /* add position() call */
                    System.out.print("n: ");
                    opd1 = sc.nextInt();
                    System.out.print("digit: ");
                    opd2 = sc.nextInt();
                    ret = position(opd1, opd2);

                    System.out.printf("position = %d \n\n", ret);
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.print("n: ");
                    opd3 = sc.nextLong();

                    retl = extractOddDigits(opd3);
                    if (retl >= -1) System.out.printf("oddDigits = %d \n\n", retl);

                    break;
                case 7: System.out.println("Program terminating ...");
            }
        } while (choice < 7);
    }

    public static void mulTest() {
        final int NUM_OF_TESTS = 5;
        int opd1, opd2, res;
        int num_correct = 0;

        Scanner sc = new Scanner(System.in);
        int usr_inp;

        for (int i = 0; i < NUM_OF_TESTS; i++) {
            opd1 = (int) (Math.random() * 10);
            opd2 = (int) (Math.random() * 10);
            res = opd1 * opd2;

            System.out.printf("How much is %d times %d? ", opd1, opd2);
            usr_inp = sc.nextInt();
            if (res == usr_inp) num_correct++;
        }

        System.out.printf("%d answers out of %d correct.", num_correct, NUM_OF_TESTS);
        System.out.println();
    }

    public static int divide(int m, int n) {
        if ((n <= 0) || (m <= 0)) {
            System.err.println("m or n not positive");
            return -1;
        }

        int tmp_m = m;
        int i = 0;
        if (tmp_m >= n) {
            while(tmp_m >= n) {
                tmp_m -= n;
                i++;
            }
        }

        return i;
    }

    public static int modulus(int m, int n) {
        if ((n <= 0) || (m <= 0)) {
            System.err.println("m or n not positive");
            return -1;
        }

        int divans = divide(m, n);
        if (divans < 0) return -1;

        return (m - (divans * n));
    }

    public static int countDigits(int n) {
        if ((n <= 0)) {
            System.out.println("n not positive");
            return -1;
        }

        double curr_mult;
        double i = 1;
        do {
            curr_mult = Math.pow(10.0, i);
            i++;
        } while (curr_mult <= n);

        return (int) (i - 1);
    }

    public static int position(int n, int digit) {
        if ((n <= 0) || (digit <= 0)) {
            System.err.println("m or digit not positive");
            return -1;
        }

        String n_str = Integer.toString(n);
        int i = 0;
        for(int j = n_str.length()-1; j >=0 ; j--){
            i++;
            if(Character.getNumericValue(n_str.charAt(j)) == digit){
                return i;
            }
        }

        return -1;
    }

    public static long extractOddDigits(long n) {
        if ((n < 0)) {
            System.err.println("n not positive");
            return -2;
        }


        List<Long> oddDigitsList = new ArrayList<>();
        Set<Long> oddDigitsSet = new HashSet<>();

        while (n > 0) {
            long digit = n % 10;
            if (digit % 2 != 0 && !oddDigitsSet.contains(digit)) {
                oddDigitsList.add(digit);
                oddDigitsSet.add(digit);
            }
            n /= 10;
        }

        Collections.reverse(oddDigitsList);

        long result = 0;
        for (long digit : oddDigitsList) {
            result = digit + result * 10;
        }

        if (result == 0) result = -1;

        return result;
    }

}
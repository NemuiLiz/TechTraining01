package day01;

public class taskThree {
    private static final int DIVISOR = 2;

    /**
     * A number divided by two, which doesn't result in a rest of zero
     * is divisable by two.2
     * @param number dividend
     * @return boolean is number diivisable by two
     */

    public static boolean isDivisibleByTwo(int number) {

            return number % 2 == 0;

    }
}

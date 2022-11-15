package uz.leetCode.arrays;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("6913259244", "71103343"));
    }

    public static String addStrings(String num1, String num2) {
        long sum = 0L;
        long counter;
        for (int i = 0; i < num1.length(); i++) {
            counter = findNumber(num1.charAt(i)) * (long) Math.pow(10, num1.length() - 1 - i);
            sum += counter;
        }

        for (int i = 0; i < num2.length(); i++) {
            counter = findNumber(num2.charAt(i)) * (long) Math.pow(10, num2.length() - 1 - i);
            sum += counter;
        }

        return sum + "";
    }

    public static int findNumber(char s) {
        switch (s) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return -1;
        }
    }
}

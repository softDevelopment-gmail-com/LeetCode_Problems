//package uz.leetCode.arrays;
//
//public class SubtractTheProductAndSumOfDigitsOfAnInteger {
//    public static void main(String[] args) {
//        System.out.println(subtractProductAndSum(234));
//    }
//    public static int subtractProductAndSum(int n) {
//
//        short product = 1;
//        short sum = 0;
//        int remainder = 0;
//        int counter = 1;
//        while (n > 0) {
//            double number=n%remainder = n % (int)(Math.pow(10, counter));
//            n = n - remainder;
//            counter++;
//            product *= remainder;
//            sum += remainder;
//        }
//        return product - sum;
//    }
//}

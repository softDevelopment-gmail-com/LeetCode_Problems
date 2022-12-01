package uz.leetCode.arrays;

public class UglyNumber {
    /*

6
1
14
468698
8
-2147483648
0
7
2
3
5
11
54
233
75
9
346
9
345
8
3
78
937351770
    */


    public static void main(String[] args) {
        System.out.println(isUgly(937351770));
    }


    public static boolean isUgly(int n) {
        if (n == 1) {
            return true;
        }
        if (n >0 ) {
            for (int i = 2; i <= n; i++) {

                if (n % i == 0) {
                    if (i != 2 && i != 3 && i != 5) {
                        if (isPrime(i)) {
                            return false;
                        }
                    }
                }
            }

        }else{
            return false;
        }
        return true;

    }



    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

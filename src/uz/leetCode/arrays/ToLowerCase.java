package uz.leetCode.arrays;

public class ToLowerCase {

    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 90 && arr[i] >= 65) {
                arr[i] += 32;
            }
        }

        return new String(arr);
    }
}

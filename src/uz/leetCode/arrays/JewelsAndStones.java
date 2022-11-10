package uz.leetCode.arrays;

public class JewelsAndStones {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.substring(i, i + 1).equals(stones.substring(j, j + 1))) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int numJewelsInStones_1(String jewels, String stones) {
        int counter = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) counter++;
        }
        return counter;
    }
}
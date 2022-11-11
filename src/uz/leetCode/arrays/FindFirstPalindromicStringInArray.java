package uz.leetCode.arrays;


public class FindFirstPalindromicStringInArray {
    public static void main(String[] args) {
        String [] strings={"notapalindrome","racecar"};
        System.out.println(firstPalindrome(strings));
    }
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (word.length() % 2 == 0) {
                for (int i = 0; i < word.length()/2; i++) {
                    if (word.indexOf(word.substring(i,i+1))!=(word.length()-1-word.lastIndexOf(word.substring(i,i+1)))) {
                        break;

                    }

                }
            } else {
                if (word.substring(0, word.length() / 2).equals(word.substring(word.length() / 2 +1))) {
                    return word;
                }
            }
        }
        return "";
    }

}

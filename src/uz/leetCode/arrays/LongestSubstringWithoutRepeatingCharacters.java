package uz.leetCode.arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("asjrgapa"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        int left = 0 ;
        int charCount[] = new int[128];
        for(int right = 0 ; right < s.length() ; right++){
            charCount[s.charAt(right)]++;

            while(charCount[s.charAt(right)] > 1){
                charCount[s.charAt(left++)]--;
            }
            maxlen = Math.max(maxlen , right - left +1);
        }
        return maxlen;
    }
}

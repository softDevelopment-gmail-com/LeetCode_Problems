package uz.leetCode.arrays;

import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {

    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleNumber = findRuleNumber(ruleKey);
        int counter = 0;
        for (List<String> item : items) {
            if (item.get(ruleNumber).equals(ruleValue)) {
                counter++;
            }
        }
        return counter;
    }

    public static int findRuleNumber(String ruleKey) {
        switch (ruleKey) {
            case "type":
                return 0;
            case "color":
                return 1;
            case "name":
                return 2;
            default:
                return -1;
        }
    }

    public int countMatches_1(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        int ruleKeyNumber = 0;
        if (ruleKey.equals("color")) {
            ruleKeyNumber = 1;
        } else if (ruleKey.equals("name")) {
            ruleKeyNumber = 2;
        }
        for (List<String> item : items) {
            if(item.get(ruleKeyNumber).equals(ruleValue)){
                counter++;
            }
        }
        return counter;
    }
}

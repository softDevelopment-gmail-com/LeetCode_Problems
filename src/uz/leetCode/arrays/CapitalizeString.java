package uz.leetCode.arrays;

public class CapitalizeString {

    public String capitalizeTitle(String title) {

        String[] strings = title.split(" ");
        StringBuilder str = new StringBuilder();

        for (String string : strings) {
            if (string.length() > 2) {
                str.append(string.substring(0, 1).toUpperCase()).append(string.substring(1).toLowerCase()).append(" ");
            } else {
                str.append(string.toLowerCase()).append(" ");
            }
        }
        return str.toString().trim();
    }
}

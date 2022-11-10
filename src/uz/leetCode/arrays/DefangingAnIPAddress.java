package uz.leetCode.arrays;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
//        System.out.println("1.1.1.1");
        System.out.println(defangIPaddr_1("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= address.length(); i++) {
            if (address.charAt(i - 1) == '.') {
                str.append("[.]");
            } else {
                str.append(address.charAt(i - 1));
            }
        }
        return str.toString();
    }

    public static String defangIPaddr_1(String address) {
       return address.replace(".","[.]");
    }
}

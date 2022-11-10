package uz.leetCode.arrays;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] strings = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(strings));
    }

    public static int finalValueAfterOperations(String[] operations) {
        String o;
        int sum = 0;
        for (String operation : operations) {
            if (operation.startsWith("X")) {
                o = operation.substring(1, 2);
            } else {
                o = operation.substring(0, 1);
            }
            if (o.equals("-")) {
                sum += -1;
            } else {
                sum += 1;
            }
        }
        return sum;
    }

    public static int findOperation(String str) {
        switch (str) {
            case "-":
                return -1;
            case "+":
                return 1;
            default:
                return 0;
        }
    }

    public static int finalValueAfterOperations_1(String[] operations) {
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '-') {
                sum -= 1;
            } else {
                sum += 1;
            }
        }
        return sum;
    }
}

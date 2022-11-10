package uz.leetCode.arrays;


public class GoalParserInterpreter {

    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        char[] array = command.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'G') {
                str.append("G");
            } else if (array[i] == '(') {
                if (array[i + 1] == 'a') {
                    str.append("al");
                    i += 3;
                } else {
                    str.append("o");
                    i++;
                }
            }
        }
        return str.toString();
    }

}

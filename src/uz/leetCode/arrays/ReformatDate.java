package uz.leetCode.arrays;

public class ReformatDate {

    public String reformatDate(String date) {
        StringBuilder reformattedDate = new StringBuilder();
        String[] strings = date.split(" ");
        reformattedDate.append(strings[2]).append("-");
        switch (strings[1]) {
            case "Jan":
                reformattedDate.append("01-");
                break;
            case "Feb":
                reformattedDate.append("02-");
                break;
            case "Mar":
                reformattedDate.append("03-");
                break;
            case "Apr":
                reformattedDate.append("04-");
                break;
            case "May":
                reformattedDate.append("05-");
                break;
            case "Jun":
                reformattedDate.append("06-");
                break;
            case "Jul":
                reformattedDate.append("07-");
                break;
            case "Avg":
                reformattedDate.append("08-");
                break;
            case "Sep":
                reformattedDate.append("09-");
                break;
            case "Oct":
                reformattedDate.append("10-");
                break;
            case "Nov":
                reformattedDate.append("11-");
                break;
            case "Dec":
                reformattedDate.append("12-");
                break;
            default:
                return null;
        }
        if (strings[0].length() == 3) {
            reformattedDate.append("0").append(strings[0].charAt(0));
        } else {
            reformattedDate.append(strings[0], 0, 2);
        }
        return reformattedDate.toString();
    }
}

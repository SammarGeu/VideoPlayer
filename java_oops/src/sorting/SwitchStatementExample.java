package sorting;

import java.util.Calendar;

public class SwitchStatementExample {
    public static void main(String[] args) {
        int option = 2;

        switch (option) {
            case 1:
                // Print current year
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                System.out.println("Current Year: " + currentYear);
                break;
            case 2:
                // Print current month
                int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // Adding 1 because months are 0-indexed
                System.out.println("Current Month: " + currentMonth);
                break;
            case 3:
                // Print current day
                int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
                System.out.println("Current Day: " + currentDay);
                break;
            default:
                // Print "Not applicable" for other cases
                System.out.println("Not applicable");
        }
    }
}

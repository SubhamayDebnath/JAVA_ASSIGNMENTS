import java.util.*;

public class a1q9b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        String season;
        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Spring";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid";
                break;
        }
        if (!season.equals("Invalid")) {
            System.out.println("The season corresponding to month " + month + " is " + season + ".");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }

}
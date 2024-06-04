import java.util.*;

public class a1q9a {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();
        String season;
        if ( month >= 1 && month <=12){
            if(month >= 3 && month <=5){
                season = "Spring";
            }else if(month >= 6 && month <= 8){
                season = "Summer";
            }else if (month >= 9 && month <=11 ){
                season = "Autumn";
            }else{
                season = "Winter";
            }
            System.out.println("The season is " + season);
        }else{
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
}

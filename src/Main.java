import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Days ");

        int days;
        String month;

        days = scanner.nextInt();

        switch(days){
            case 30: month = "September, April, June, November";
                break;
            case 31: month = "January, March, May, July, August, October, December";
                break;
            case 28: month = "February";
                break;
            default: month = "No Month has exactly " + days + " days in it";
                break;
        }
        System.out.println(month);

    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LeapYearCalculator isYear = new LeapYearCalculator();
                Scanner  inputYear = new Scanner(System.in);
        System.out.println("Введите Год");
        int  year = inputYear.nextInt();
        boolean a = isYear.isLeapYear(year);

        if(year >= 10000 && year <= 0){
            System.out.println("превышен порог");
        } else if (a) {
            System.out.println("этот год высокосный");
        } else {
            System.out.println(" это обычный год");
        }
    }
}
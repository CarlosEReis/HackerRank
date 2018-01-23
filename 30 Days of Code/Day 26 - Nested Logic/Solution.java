
/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
import java.time.LocalDate;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate actual   = readScan(in);
        LocalDate expected = readScan(in);
        in.close();
        System.out.println(calc(actual, expected));
    }
    
	private static int calc(LocalDate actual, LocalDate expected) {
		int hackos;
		if (actual.isBefore(expected) || actual.isEqual(expected)) {
			hackos = 0;
		} else if (actual.getMonth() == expected.getMonth() && actual.getYear() == expected.getYear()) {
			hackos = (actual.getDayOfMonth() - expected.getDayOfMonth()) * 15;
		} else if (actual.getYear() == expected.getYear()) {
			hackos = (actual.getMonthValue() - expected.getMonthValue()) * 500;
		} else {
			hackos = 10000;
		}
		return hackos;
	}
    
    private static LocalDate readScan(Scanner in){
        int day   = in.nextInt();
        int month = in.nextInt();
        int year  = in.nextInt();
        return LocalDate.of(year, month, day);
    }
}
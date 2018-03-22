package leapYear;
import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s="";
		int year=scanner.nextInt();
		while(year>0) {
				if((year % 4 == 0 && year % 100 != 0) || year%400 == 0) {
					s="윤년입니다";
				}
				else {
					s="평년입니다";
				}
				System.out.println(s);
				year=scanner.nextInt();
		}
		
	}

}

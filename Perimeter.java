
import java.util.Scanner;
public class Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int perimeter=0;
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();		
		
		
		while(number>0) {
			int temp=0;
			int preLength=0;
			int length=1;
			int count;
		
			
			for(count=1; count<=number; count++) {
			
				if(count!=1) {
					length = length + temp;
					temp = preLength;
					preLength = length;
				}
				else {
					temp = 1;
					preLength = 1;
				}
			perimeter = (preLength + temp) * 2;
			}
			System.out.printf("사각형 둘레는 %d\n", perimeter);
			
			number = scanner.nextInt();
		}
	}

}

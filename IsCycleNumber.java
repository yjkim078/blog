import java.util.Scanner;

public class IsCycleNumber {

	public static void main(String[] args) {
		
		int number;
		int quotient;
		int remainder;
		int result = 10;
		int count=0;
	
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();

		if(inputNumber>0 && inputNumber<=99) { //입력받은 수가 0보다 크고 99이하일 경우에 실행
			
			while(result !=inputNumber) {
				if(count==0) {
					number=inputNumber;
				}
				else {
					number=result;
				}
				quotient = number/10;
				remainder=number-(quotient*10);
				result=quotient+remainder;
				quotient=remainder;
				remainder=result;
				count++;
			}
			System.out.printf("싸이클 수는 %d",count);
		}
		else 
		{
			System.out.printf("범위를 벗어났습니다.");
		}
	}

}

import java.util.Scanner;

public class IsCycleNumber {

	public static void main(String[] args) {
		
		int number;
		int quotient ;
		int remainder ;
		int result=0;
		int count=0;
	
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();

		if(inputNumber>0 && inputNumber<=99) { //�Է¹��� ���� 0���� ũ�� 99������ ��쿡 ����
			number=inputNumber;
			
			quotient = number/10;
			remainder=number -(quotient*10);
			
			while(result !=inputNumber) {
				
				result=result % 10;
				result=quotient+remainder;
				quotient=remainder;
				remainder=result;
				count++;
				System.out.printf("����Ŭ ���� %d",count);
			}
			
		}
		else 
		{
			System.out.printf("������ ������ϴ�.");
		}
	}

}

import java.util.Scanner;
public class PrintStars {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
			for(int i=number; i>=1; i--) 
			{
				
				for(int j=0; j<=number-i; j++) {
					System.out.printf(" ");
				}
				
				for(int k=0; k<i; k++) {
					System.out.printf("*");
				}
				
				System.out.printf("\n");
			}
	}

}

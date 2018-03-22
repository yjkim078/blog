import java.util.Scanner;
public class AreaofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int number;
	int temp=0;
	int preLength=1;
	int length=1;
	int area;
	int totalArea=0;
	
	Scanner scanner = new Scanner(System.in);
	
	number=scanner.nextInt();
	
	for(int count=1; count<=number; count++) {
		if(count>2) 
		{
			temp=preLength;
			preLength=length;
			length=temp + preLength;
		}
		else
		{
			length = temp + length;
			
		}
		area=length * length;
		totalArea=totalArea + area;
	}
	
	System.out.printf("»ç°¢ÇüÀÇ ÃÑ ³ÐÀÌ´Â %d\n", totalArea);
	scanner.close();
	}

}

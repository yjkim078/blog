import java.util.ArrayList;
import java.util.List;

public class AverageList {

	public static void main(String[] args) {
		
		int sum = 0;
		float average;
		
		List<Integer> score = new ArrayList<Integer>();
		
		score.add(12);
		score.add(62);
		score.add(43);
		score.add(90);
		score.add(93);
		
		for(int data: score) { //���� ���ϱ�
			sum = data + sum;
		}
		
		average = sum / score.size(); //��� ���ϱ�
		System.out.println(average); //���
	}

}

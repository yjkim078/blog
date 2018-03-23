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
		
		for(int data: score) { //총합 구하기
			sum = data + sum;
		}
		
		average = sum / score.size(); //평균 구하기
		System.out.println(average); //출력
	}

}

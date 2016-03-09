package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();
		int result;
		/* 여기에 구현 코드를 작성 합니다. */

		if(inputNumber %2 == 0)
			result = (inputNumber /2) * ( (inputNumber + 2) /2);
		else
			result = ((inputNumber +1) /2) * ((inputNumber + 1) /2);
		
		System.out.println("result : " + result);
		scanner.close();
	}

}

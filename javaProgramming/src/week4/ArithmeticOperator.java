package week4;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a= new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int time= a.nextInt();
		int second= time%60;
		int minute=(time/60)%60;
		int hour= (time/60)/60%24;
		int day= (time/60)/60/24;
		
		System.out.print(time+"초는 ");
		System.out.print(day+"일 ");
		System.out.print(hour+"시간, ");
		System.out.print(minute+"분, ");
		System.out.println(second+"초입니다.");
		
		a.close();
	}

}

package week8;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료됩니다");
		while (true) {
			System.out.println(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("종료합니다... ");
		
		scanner.close();
	}

}

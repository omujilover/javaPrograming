package week3;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하세요");
		
		String name= scanner.next();
		System.out.println("이름은"+name+",");
		String city= scanner.next();
		System.out.println("도시는"+city+",");
		int age= scanner.nextInt();
		System.out.println("나이는"+age+"세,");
		double weight= scanner.nextDouble();
		System.out.println("몸무게는"+weight+"kg,");
		boolean isSingle= scanner.nextBoolean();
		System.out.println("독신여부는"+isSingle+"입니다.");
		System.out.println("감사합니다.");
		scanner.close();
	}
 
}

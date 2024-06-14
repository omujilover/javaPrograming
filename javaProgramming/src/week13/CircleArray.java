package week13;

class Circle { 
	int radius; 

	// Circle 클래스의 생성자
	public Circle(int radius) {
		this.radius = radius; // radius 필드를 입력된 값으로 초기화
	}

	// 원의 넓이를 반환하는 메서드
	public double getArea() {
		return 3.14 * radius * radius; // 원의 넓이를 계산해서 반환
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle[] c; // Circle 객체의 배열을 선언
		c = new Circle[5]; // 길이가 5인 Circle 배열을 생성

		// Circle 객체를 생성하고 배열에 할당
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i); // 반지름을 i로 하여 Circle 객체 생성 후 배열에 할당
		}

		// 배열에 저장된 각 Circle 객체의 넓이를 출력
		for (int i = 0; i < c.length; i++) {
			System.out.print((int) (c[i].getArea()) + " "); // 각 원의 넓이를 정수형으로 변환하여 출력
		}
	}
}


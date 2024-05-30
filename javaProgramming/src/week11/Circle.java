package week11;

public class Circle {  //circle의 클래스 만듦
	int radius; // 반지름 만듦
	String name; // 이름 만듦
	
	public Circle() {} //범용적 원의 생성자
	
	public double getArea() { //원의 면적을 계산함
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza; //pizza라는 circle을 만듦
		pizza = new Circle();
		pizza.radius = 10; //반지름 10
		pizza.name = "자바피자"; //이름 자바피자
		double area = pizza.getArea(); //면적 구하기
		System.out.println(pizza.name + "의 면적은 "+area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+ "의 면적은 "+ area);
	}

}

package week13;

public class MethodSample {
	public int getSum(int i, int j) {
		System.out.println("작동됨");
		return i + j;
	}

	public int getSum(int i, int j, int k) {
		System.out.println("작동됨");
		return i + j + k;
	}

	public double getSum(double i, double j) {
		System.out.println("작동됨");
		return i + j;
	}
	
	public String getSum(double i, int j) {
		System.out.println("작동됨");
		return String.valueOf(i + j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSample a = new MethodSample();

		int i = a.getSum(1, 2);
		
		int j = a.getSum(1, 2, 3);
		
		double k = a.getSum(1.1, 2.2);
		
		String s = a.getSum(1.5, 4);
	}

}

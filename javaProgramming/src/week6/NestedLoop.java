package week6;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;

		for (i = 1; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print('\t');
			}
			System.out.println();
		}
	}

}

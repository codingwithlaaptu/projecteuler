public class Problem1 {

	public static void main(String[] args) {
		fiventhreemultipleSum();
	}

	private static void fiventhreemultipleSum() {
		int sum = 0;
		for (int i = 3; i < 1000; i++) {
			if (i % 15 == 0 || i % 5 == 0 || i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);

	}
}

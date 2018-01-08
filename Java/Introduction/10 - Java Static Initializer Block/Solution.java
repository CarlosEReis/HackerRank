/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
class Solution {
	private static boolean flag;
	private static int B;
	private static int H;

	static {
		Scanner in = new Scanner(System.in);
		B = in.nextInt();
		H = in.nextInt();
		in.close();

		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		} else {
			flag = true;
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}
}




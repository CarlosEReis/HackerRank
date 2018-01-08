/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1;
		while (in.hasNext()) {
			String s = in.nextLine();
			System.out.println(i + " " + s);
			i++;
		}
		in.close();
	}
}

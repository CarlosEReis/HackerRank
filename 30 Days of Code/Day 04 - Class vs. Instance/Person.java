/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
public class Person {
	private int age;

	public Person(int initialAge) {
		// Add some more code to run some checks on initialAge
		if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			this.age = 0;
		} else {
			this.age = initialAge;
		}
	}

	public void amIOld() {
		// Write code determining if this person's age is old andYou are a teenager..
		// print the correct statement:
		String response;
		if (this.age < 13) {
			response = "You are young.";
		} else if (this.age >= 13 && this.age < 18) {
			response = "You are a teenager.";
		} else {
			response = "You are old.";
		}

		System.out.println(response);
	}

	public void yearPasses() {
		// Increment this person's age.
		this.age += 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}

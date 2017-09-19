package src.main.java.HackerRank;

/* Task: Write a Person class with an instance variable, age, 
 * and a constructor that takes an integer, initialAge, as a parameter. 
 * The constructor must assign initialAge to age after confirming the argument
 *  passed as initialAge is not negative; if a negative argument is passed as initialAge,
 *   the constructor should set age to 0 and print Age is not valid,
 *    setting age to 0.. In addition, you must write the following instance methods:
1. yearPasses() should increase the age instance variable by 1.
2. amIOld() should perform the following conditional actions:
	If age<13, print You are young..
	If age >=13 and age <18, print You are a teenager..
Otherwise, print You are old..
To help you learn by example and complete this challenge, much of the code is 
provided for you, but you'll be writing everything in the future. 
The code that creates each instance of your Person class is in the main method.
Don't worry if you don't understand it all quite yet!*/

/*Ex: Sample Input:-1
10
16
18

Sample Output:Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.
*/

public class Day4 {

	int age;

	public Day4(int initialAge) {
		if (initialAge >= 0) {
			age = initialAge;
		} else {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}

	public void yearPasses() {
		age++;
	}

	public void amIOld() {
		String str = "";
		if (age < 13)
			str = "You are young.";
		else if (age >= 13 && age < 18)
			str = "You are a teenager.";
		else
			str = "You are old.";
		System.out.println(str);
	}

	public static void main(String[] args) {
		Day4 day1 = new Day4(-1);
		
		day1.yearPasses();
		day1.amIOld();
		day1.yearPasses();
		day1.amIOld();

		Day4 day2 = new Day4(10);
		day2.yearPasses();
		day2.amIOld();
		day2.yearPasses();
		day2.amIOld();
		
		Day4 day3 = new Day4(16);
		day3.yearPasses();
		day3.amIOld();
		day3.yearPasses();
		day3.amIOld();
		
		Day4 day4 = new Day4(18);
		day4.yearPasses();
		day4.amIOld();
		day4.yearPasses();
		day4.amIOld();
	}

}

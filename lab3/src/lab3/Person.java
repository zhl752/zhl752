/*
* Name:zhiwei Lin
 * Section:Thesday 12:30-1:45
 * 
 * 
*/
public class Person {
	static int cyear = 2017;
	private String name;
	private int bdate;
	private int age;
	
	//constructor
	public Person(String name, int bdate){
		this.name = name;
		this.bdate = bdate;
	}

	
	public void reset_birthday(int birthdayYear){
		bdate = birthdayYear;
	}
	
	public void reset_currentYear(int currentYear) {
		cyear= currentYear;
	}
	
	public void display_age(){
		calc_age();
		System.out.println("I am years old ");
		System.out.println(age);
		isSenior();
	}


	private void isSenior() {
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}


	private void calc_age() {
		age = bdate - cyear;
	}
    
	public void show_person_info() {
		System.out.println("This is " + name);
		System.out.println("I was born in.");
		System.out.println(bdate);
		
    	
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.show_person_info();
		John.display_age();
		John.calc_age();
	}

}
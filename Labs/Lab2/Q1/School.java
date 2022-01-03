package np.com.school;

public class School {
	private String name;
	private long number;

	public School(String name, long num) {
		this.name = name;
		this.number = num;
	} 

	public void display() {
		System.out.println("Name: " + name );
		System.out.println("Contact: " + number);
	}
}
/**
 * Stores information from a user 
 * @author elev
 *
 */
public class UserInformation {

	private String firstName;
	private String lastName;
	private String occupation;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getOccupation() {
		return occupation;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws NegativeAgeException {
		if(age < 0) throw new NegativeAgeException("You entered a negative age: " + age);
		this.age = age;
	}
	
	public String getFullName(){
		return this.firstName + " " + this.lastName;
	}
	
	
	
	
	
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;


public class CodeAlong1b {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		List<UserInformation> users = readUserInput(inputReader);
		
		printAllUsersInformation(users);
		
	}
	
	private static List<UserInformation> readUserInput(BufferedReader inputReader) throws IOException{
		List<UserInformation> users = new LinkedList<UserInformation>();
		
		while(true){
			UserInformation pInfo = new UserInformation();
			
			
			
			System.out.println("Enter your firstName: ");
			pInfo.setFirstName(inputReader.readLine());
			System.out.println("Enter your lastName: ");
			pInfo.setLastName(inputReader.readLine());
			System.out.println("Enter your age: ");
			try{
				pInfo.setAge( Integer.parseInt(inputReader.readLine()));	
			} catch(NegativeAgeException e){
				System.out.println(e.getMessage());
			}
			
			System.out.println("Enter your occupation: ");
			pInfo.setOccupation(inputReader.readLine());
			users.add(pInfo);
			
			System.out.println("Want to continue(y/n)");
			String answer = inputReader.readLine();
			if(!answer.equals("y")){
				break;
			} 
		}
		inputReader.close();
		return users;
	}
	
	public static char getAgeSuffix(int age){
		char ageSuffix;
		if(age < 15){
			ageSuffix = 'J';
		} else if( age >= 65){
			ageSuffix = 'S';
		} else {
			ageSuffix = 'A';
		}
		return ageSuffix;
	}
	
	public static String getPriceCathegory(char ageSuffix){
		switch( ageSuffix ){
		case 'J':
			return "You are under 15 and will pay a Junior price.";
		case 'S':
			return "You are 65 or older and will pay a Senior price.";
		default:
			return "You will pay full price";
		}
	}
	
	private static void printAllUsersInformation(List<UserInformation> users){
		for(UserInformation userInfo : users){
			printUserInformation(userInfo);
		}
	}
	
	private static void printUserInformation(UserInformation userInfo){

		System.out.format("\nFirstname: %1$s%nLastname: %2$s%nAge: %3$d%nAgeSuffix: %4$c%nOccupation: %5$s%Price: %6$s%n%n",
				userInfo.getFirstName(), 
				userInfo.getLastName(), 
				userInfo.getAge(), 
				getAgeSuffix(userInfo.getAge()),
				userInfo.getOccupation(),
				getPriceCathegory(getAgeSuffix(userInfo.getAge())));
		
		
	}
}

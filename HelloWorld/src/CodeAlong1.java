import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class CodeAlong1 {

	/**
	 * First program
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> questions = new LinkedList<String>();
		LinkedList<String> answers = new LinkedList<String>();
		
		questions.add("Enter first name: ");
		questions.add("Enter last name: ");
		questions.add("Enter age: ");
		questions.add("Enter occupation: ");
		
		try(BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));){
			for(int i = 0; i < questions.size(); i++){
				System.out.print(questions.get(i));
				String inputLine = inputReader.readLine();
				answers.add(inputLine);
			} 		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.format("\nFirstname: %1$s%nLastname: %2$s%nAge: %3$d%nOccupation: %4$s%n",
					answers.get(0), 
					answers.get(1), 
					Integer.parseInt(answers.get(2)), 
					answers.get(3));
		}
	}
}
